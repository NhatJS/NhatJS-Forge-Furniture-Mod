package net.nhatjs.js_furniture_mod.blockentity.client;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.nhatjs.js_furniture_mod.block.CoffeeTableBlock;
import net.nhatjs.js_furniture_mod.blockentity.ModBlockEntities;

public class CoffeeTableBlockEntity extends BlockEntity {
    private ItemStack stack = ItemStack.EMPTY;
    private int renderNonce = 0;

    public CoffeeTableBlockEntity(BlockPos pos, BlockState s) { super(ModBlockEntities.COFFEE_TABLE.get(), pos, s); }

    public ItemStack getItem() { return stack; }
    public int getRenderNonce() { return renderNonce; }

    public void setItem(ItemStack s) {
        this.stack = (s == null ? ItemStack.EMPTY : s);
        this.renderNonce++;
        setChanged();

        if (level != null && !level.isClientSide()) {
            level.setBlock(getBlockPos(), getBlockState().setValue(CoffeeTableBlock.HAS_ITEM, !stack.isEmpty()), 3);
            ((ServerLevel)level).getChunkSource().blockChanged(getBlockPos());
        }
    }
    @Override protected void saveAdditional(CompoundTag nbt) {
        super.saveAdditional(nbt);
        if (!stack.isEmpty()) {
            CompoundTag itemTag = new CompoundTag();
            stack.save(itemTag);
            nbt.put("it", itemTag);
        }
        nbt.putInt("rn", renderNonce);
    }

    @Override public void load(CompoundTag nbt) {
        super.load(nbt);
        if (nbt.contains("it",Tag.TAG_COMPOUND)) {
            this.stack = ItemStack.of(nbt.getCompound("it"));
        }
        else {
            this.stack = ItemStack.EMPTY;
        }
        this.renderNonce = nbt.getInt("rn");
    }

    @Override public Packet<ClientGamePacketListener> getUpdatePacket() { return ClientboundBlockEntityDataPacket.create(this); }
    @Override public CompoundTag getUpdateTag() { return saveWithoutMetadata(); }
}