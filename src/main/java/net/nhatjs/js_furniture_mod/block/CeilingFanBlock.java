package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CeilingFanBlock extends Block {
    public static final BooleanProperty TURN_ON = BooleanProperty.create("turn_on");

    private final DyeColor color;

    public CeilingFanBlock(DyeColor color, Properties settings)
    {
        super(settings);
        this.color = color;
        registerDefaultState(getStateDefinition().any().setValue(TURN_ON, false));
    }

    public DyeColor getColor()
    {
        return this.color;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Block.box(0, 11, 0, 16, 16, 16);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(TURN_ON);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide()) {
            level.setBlock(pos, state.cycle(TURN_ON), Block.UPDATE_ALL);
        }
        return InteractionResult.SUCCESS;
    }
}