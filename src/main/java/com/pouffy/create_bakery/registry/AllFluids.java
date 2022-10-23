package com.pouffy.create_bakery.registry;

import com.pouffy.create_bakery.CreateBakery;
import com.pouffy.create_bakery.data.CreateBakeryRegistrate;
import com.pouffy.create_bakery.registry.BakeryTags.AllFluidTags;
import com.simibubi.create.AllTags;
import com.simibubi.create.content.contraptions.fluids.VirtualFluid;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.entry.FluidEntry;
import com.tterrag.registrate.builders.FluidBuilder;
import com.tterrag.registrate.util.nullness.NonNullBiFunction;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.Tags;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import static com.pouffy.create_bakery.registry.BakeryTags.AllFluidTags.*;

public class AllFluids {
    private static final CreateRegistrate REGISTRATE = CreateBakery.registrate();

    public static final ResourceLocation ICING_STILL_RL = CreateBakery.genRL("fluid/icing_still");
    public static final ResourceLocation ICING_FLOW_RL = CreateBakery.genRL("fluid/icing_flow");
    public static final ResourceLocation BUTTER_CREAM_STILL_RL = CreateBakery.genRL("fluid/butter_cream_still");
    public static final ResourceLocation BUTTER_CREAM_FLOW_RL = CreateBakery.genRL("fluid/butter_cream_flow");
    public static final ResourceLocation PLAIN_CAKE_BATTER_STILL_RL = CreateBakery.genRL("fluid/plain_cake_batter_still");
    public static final ResourceLocation PLAIN_CAKE_BATTER_FLOW_RL = CreateBakery.genRL("fluid/plain_cake_batter_flow");
    public static final ResourceLocation CHOCOLATE_ICING_STILL_RL = CreateBakery.genRL("fluid/chocolate_icing_still");
    public static final ResourceLocation CHOCOLATE_ICING_FLOW_RL = CreateBakery.genRL("fluid/chocolate_icing_flow");
    public static final ResourceLocation SWEET_BERRY_JAM_STILL_RL = CreateBakery.genRL("fluid/sweet_berry_jam_still");
    public static final ResourceLocation SWEET_BERRY_JAM_FLOW_RL = CreateBakery.genRL("fluid/sweet_berry_jam_flow");
    public static final ResourceLocation GLOW_BERRY_JAM_STILL_RL = CreateBakery.genRL("fluid/sweet_berry_jam_still");
    public static final ResourceLocation GLOW_BERRY_JAM_FLOW_RL = CreateBakery.genRL("fluid/sweet_berry_jam_flow");
    public static final FluidEntry<ForgeFlowingFluid.Flowing> VANILLA_ICING =
            CreateBakery.registrate().fluid("icing", ICING_STILL_RL, ICING_FLOW_RL, NoColorFluidAttributes::new)
                    .attributes(b -> b.viscosity(2000)
                            .density(1400))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(25)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new) // TODO: remove when Registrate fixes FluidBuilder
                    .tag(AllTags.forgeFluidTag("vanilla_icing"))
                    .bucket()
                    .build()
                    .register();

    public static final FluidEntry<ForgeFlowingFluid.Flowing> PLAIN_CAKE_BATTER =
            CreateBakery.registrate().fluid("plain_cake_batter", PLAIN_CAKE_BATTER_STILL_RL, PLAIN_CAKE_BATTER_FLOW_RL, NoColorFluidAttributes::new)
                    .attributes(b -> b.viscosity(2000)
                            .density(1400))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(25)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new) // TODO: remove when Registrate fixes FluidBuilder
                    .tag(AllTags.forgeFluidTag("plain_cake_batter"))
                    .bucket()
                    .build()
                    .register();

    public static final FluidEntry<ForgeFlowingFluid.Flowing> BUTTER_CREAM =
            CreateBakery.registrate().fluid("butter_cream", BUTTER_CREAM_STILL_RL, BUTTER_CREAM_FLOW_RL, NoColorFluidAttributes::new)
                    .attributes(b -> b.viscosity(2000)
                            .density(1400))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(25)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new) // TODO: remove when Registrate fixes FluidBuilder
                    .tag(AllTags.forgeFluidTag("butter_cream"))
                    .bucket()
                    .build()
                    .register();

    public static final FluidEntry<VirtualFluid> VANILLA_EXTRACT = REGISTRATE.virtualFluid("vanilla_extract")
            .lang("Vanilla Extract")
            .tag(AllTags.forgeFluidTag("vanilla_extract"))
            .register();

    public static final FluidEntry<ForgeFlowingFluid.Flowing> CHOCOLATE_ICING =
            CreateBakery.registrate().fluid("chocolate_icing", CHOCOLATE_ICING_STILL_RL, CHOCOLATE_ICING_FLOW_RL, NoColorFluidAttributes::new)
                    .attributes(b -> b.viscosity(2000)
                            .density(1400))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(25)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new) // TODO: remove when Registrate fixes FluidBuilder
                    .tag(AllTags.forgeFluidTag("chocolate_icing"))
                    .bucket()
                    .build()
                    .register();
//    public static final FluidEntry<ForgeFlowingFluid.Flowing> PANCAKE_BATTER =
//            CreateBakery.registrate().fluid("pancake_batter", PLAIN_CAKE_BATTER_STILL_RL, PLAIN_CAKE_BATTER_FLOW_RL, NoColorFluidAttributes::new)
//                    .attributes(b -> b.viscosity(2000)
//                            .density(1400))
//                    .properties(p -> p.levelDecreasePerBlock(2)
//                            .tickRate(25)
//                            .slopeFindDistance(6)
//                            .explosionResistance(100f))
//                    .source(ForgeFlowingFluid.Source::new) // TODO: remove when Registrate fixes FluidBuilder
//                    .tag(AllTags.forgeFluidTag("pancake_batter"))
//                    .bucket()
//                    .build()
//                    .register();
public static final FluidEntry<ForgeFlowingFluid.Flowing> SWEET_BERRY_JAM =
        CreateBakery.registrate().fluid("sweet_berry_jam", SWEET_BERRY_JAM_STILL_RL, SWEET_BERRY_JAM_FLOW_RL, NoColorFluidAttributes::new)
                .attributes(b -> b.viscosity(2000)
                        .density(1400))
                .properties(p -> p.levelDecreasePerBlock(2)
                        .tickRate(25)
                        .slopeFindDistance(6)
                        .explosionResistance(100f))
                .source(ForgeFlowingFluid.Source::new) // TODO: remove when Registrate fixes FluidBuilder
                .tag(AllTags.forgeFluidTag("sweet_berry_jam"))
                .bucket()
                .build()
                .register();
    public static final FluidEntry<ForgeFlowingFluid.Flowing> GLOW_BERRY_JAM =
            CreateBakery.registrate().fluid("glow_berry_jam", GLOW_BERRY_JAM_STILL_RL, GLOW_BERRY_JAM_FLOW_RL, NoColorFluidAttributes::new)
                    .attributes(b -> b.viscosity(2000)
                            .density(1400))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(25)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new) // TODO: remove when Registrate fixes FluidBuilder
                    .tag(AllTags.forgeFluidTag("glow_berry_jam"))
                    .bucket()
                    .build()
                    .register();
    public static void register() {}

    private static class NoColorFluidAttributes extends FluidAttributes {

        protected NoColorFluidAttributes(Builder builder, Fluid fluid) {
            super(builder, fluid);
        }

        @Override
        public int getColor(BlockAndTintGetter world, BlockPos pos) {
            return 0x00ffffff;
        }

    }
}
