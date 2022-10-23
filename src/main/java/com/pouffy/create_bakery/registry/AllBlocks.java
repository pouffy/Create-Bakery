package com.pouffy.create_bakery.registry;

import com.pouffy.create_bakery.CreateBakery;
import com.pouffy.create_bakery.content.block.NoCandleCakeBlock;
//import com.pouffy.create_bakery.content.contraptions.components.dough_mixer.DoughMixerBlock;
import com.pouffy.create_bakery.data.CreateBakeryRegistrate;
import com.simibubi.create.AllTags;
import com.simibubi.create.content.contraptions.components.AssemblyOperatorBlockItem;
import com.simibubi.create.content.contraptions.components.mixer.MechanicalMixerBlock;
import com.simibubi.create.content.contraptions.processing.BasinBlock;
import com.simibubi.create.content.contraptions.processing.BasinGenerator;
import com.simibubi.create.foundation.block.BlockStressDefaults;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.ModelGen;
import com.simibubi.create.foundation.data.SharedProperties;
import com.simibubi.create.repack.registrate.builders.BlockBuilder;
import com.simibubi.create.repack.registrate.util.entry.BlockEntry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;

import static com.simibubi.create.foundation.data.ModelGen.customItemModel;

public class AllBlocks {
    private static final CreateRegistrate REGISTRATE = CreateBakery.registrate()
            .creativeModeTab(() -> CreateBakery.BASE_CREATIVE_TAB);

    public static final BlockEntry<CropBlock> VANILLA_CROP =
            REGISTRATE.block("vanilla_crop", CropBlock::new)
                    .initialProperties(() -> Blocks.WHEAT)
                    .properties(p -> p.color(MaterialColor.COLOR_BROWN))
                    .lang("Vanilla")
                    .register();
    public static final BlockEntry<NoCandleCakeBlock> BUTTERCREAM_CAKE =
            REGISTRATE.block("buttercream_cake", NoCandleCakeBlock::new)
                    .initialProperties(() -> Blocks.CAKE)
                    .properties(p -> p.color(MaterialColor.COLOR_BROWN))
                    .lang("Buttercream Iced Cake")
                    .register();
    public static final BlockEntry<NoCandleCakeBlock> CHOCOLATE_CAKE =
            REGISTRATE.block("chocolate_cake", NoCandleCakeBlock::new)
                    .initialProperties(() -> Blocks.CAKE)
                    .properties(p -> p.color(MaterialColor.COLOR_BROWN))
                    .lang("Chocolate Iced Cake")
                    .register();
    public static final BlockEntry<NoCandleCakeBlock> VANILLA_CAKE =
            REGISTRATE.block("vanilla_cake", NoCandleCakeBlock::new)
                    .initialProperties(() -> Blocks.CAKE)
                    .properties(p -> p.color(MaterialColor.COLOR_BROWN))
                    .lang("Vanilla Iced Cake")
                    .register();
    //public static final BlockEntry<DoughMixerBlock> DOUGH_MIXER =
    //        REGISTRATE.block("dough_mixer", DoughMixerBlock::new)
    //                .initialProperties(SharedProperties::stone)
    //                .properties(p -> p.color(MaterialColor.STONE))
    //                .properties(BlockBehaviour.Properties::noOcclusion)
    //                .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
    //                .addLayer(() -> RenderType::cutoutMipped)
    //                .transform(BlockStressDefaults.setImpact(4.0))
    //                .item(AssemblyOperatorBlockItem::new)
    //                .transform(customItemModel())
    //                .register();
    public static void register() {}
}
