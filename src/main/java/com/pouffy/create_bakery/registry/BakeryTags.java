package com.pouffy.create_bakery.registry;

import com.pouffy.create_bakery.CreateBakery;
import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.recipe.Mods;
import com.simibubi.create.foundation.utility.Lang;
import com.simibubi.create.repack.registrate.builders.BlockBuilder;
import com.simibubi.create.repack.registrate.builders.ItemBuilder;
import com.simibubi.create.repack.registrate.providers.ProviderType;
import com.simibubi.create.repack.registrate.util.nullness.NonNullFunction;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.util.Collections;

import static com.pouffy.create_bakery.registry.BakeryTags.NameSpace.*;

public class BakeryTags {

    private static final CreateRegistrate REGISTRATE = Create.registrate()
            .creativeModeTab(() -> Create.BASE_CREATIVE_TAB);

    public static <T extends IForgeRegistryEntry<T>> TagKey<T> optionalTag(IForgeRegistry<T> registry,
                                                                           ResourceLocation id) {
        return registry.tags()
                .createOptionalTagKey(id, Collections.emptySet());
    }

    public static <T extends IForgeRegistryEntry<T>> TagKey<T> forgeTag(IForgeRegistry<T> registry, String path) {
        return optionalTag(registry, new ResourceLocation("forge", path));
    }

    public static TagKey<Block> forgeBlockTag(String path) {
        return forgeTag(ForgeRegistries.BLOCKS, path);
    }

    public static TagKey<Item> forgeItemTag(String path) {
        return forgeTag(ForgeRegistries.ITEMS, path);
    }

    public static TagKey<Fluid> forgeFluidTag(String path) {
        return forgeTag(ForgeRegistries.FLUIDS, path);
    }

    public static <T extends Block, P> NonNullFunction<BlockBuilder<T, P>, BlockBuilder<T, P>> axeOrPickaxe() {
        return b -> b.tag(BlockTags.MINEABLE_WITH_AXE)
                .tag(BlockTags.MINEABLE_WITH_PICKAXE);
    }

    public static <T extends Block, P> NonNullFunction<BlockBuilder<T, P>, BlockBuilder<T, P>> axeOnly() {
        return b -> b.tag(BlockTags.MINEABLE_WITH_AXE);
    }

    public static <T extends Block, P> NonNullFunction<BlockBuilder<T, P>, BlockBuilder<T, P>> pickaxeOnly() {
        return b -> b.tag(BlockTags.MINEABLE_WITH_PICKAXE);
    }

    public static <T extends Block, P> NonNullFunction<BlockBuilder<T, P>, ItemBuilder<BlockItem, BlockBuilder<T, P>>> tagBlockAndItem(
            String... path) {
        return b -> {
            for (String p : path)
                b.tag(forgeBlockTag(p));
            ItemBuilder<BlockItem, BlockBuilder<T, P>> item = b.item();
            for (String p : path)
                item.tag(forgeItemTag(p));
            return item;
        };
    }

    public enum NameSpace {

        MOD(CreateBakery.MODID, false, true), FORGE("forge"), TIC("tconstruct"), QUARK("quark")

        ;

        public final String id;
        public final boolean optionalDefault;
        public final boolean alwaysDatagenDefault;

        NameSpace(String id) {
            this(id, true, false);
        }

        NameSpace(String id, boolean optionalDefault, boolean alwaysDatagenDefault) {
            this.id = id;
            this.optionalDefault = optionalDefault;
            this.alwaysDatagenDefault = alwaysDatagenDefault;
        }

    }

    public enum AllBlockTags {

        BRITTLE,
        CASING,
        FAN_TRANSPARENT,
        NON_MOVABLE,
        ORE_OVERRIDE_STONE,
        PASSIVE_BOILER_HEATERS,
        SAFE_NBT,
        SEATS,
        TOOLBOXES,
        VALVE_HANDLES,
        WINDMILL_SAILS,
        WINDOWABLE,
        WRENCH_PICKUP,
        TREE_ATTACHMENTS,

        RELOCATION_NOT_SUPPORTED(FORGE),
        WG_STONE(FORGE),

        SLIMY_LOGS(TIC),
        NON_DOUBLE_DOOR(NameSpace.QUARK),

        ;

        public final TagKey<Block> tag;

        AllBlockTags() {
            this(MOD);
        }

        AllBlockTags(NameSpace namespace) {
            this(namespace, namespace.optionalDefault, namespace.alwaysDatagenDefault);
        }

        AllBlockTags(NameSpace namespace, String path) {
            this(namespace, path, namespace.optionalDefault, namespace.alwaysDatagenDefault);
        }

        AllBlockTags(NameSpace namespace, boolean optional, boolean alwaysDatagen) {
            this(namespace, null, optional, alwaysDatagen);
        }

        AllBlockTags(NameSpace namespace, String path, boolean optional, boolean alwaysDatagen) {
            ResourceLocation id = new ResourceLocation(namespace.id, path == null ? Lang.asId(name()) : path);
            if (optional) {
                tag = optionalTag(ForgeRegistries.BLOCKS, id);
            } else {
                tag = BlockTags.create(id);
            }
            if (alwaysDatagen) {
                REGISTRATE.addDataGenerator(ProviderType.BLOCK_TAGS, prov -> prov.tag(tag));
            }
        }

        @SuppressWarnings("deprecation")
        public boolean matches(Block block) {
            return block.builtInRegistryHolder()
                    .is(tag);
        }

        public boolean matches(BlockState state) {
            return state.is(tag);
        }

        public void add(Block... values) {
            REGISTRATE.addDataGenerator(ProviderType.BLOCK_TAGS, prov -> prov.tag(tag)
                    .add(values));
        }

        public void addOptional(Mods mod, String... ids) {
            REGISTRATE.addDataGenerator(ProviderType.BLOCK_TAGS, prov -> {
                TagsProvider.TagAppender<Block> builder = prov.tag(tag);
                for (String id : ids)
                    builder.addOptional(mod.asResource(id));
            });
        }

        public void includeIn(TagKey<Block> parent) {
            REGISTRATE.addDataGenerator(ProviderType.BLOCK_TAGS, prov -> prov.tag(parent)
                    .addTag(tag));
        }

        public void includeIn(AllBlockTags parent) {
            includeIn(parent.tag);
        }

        public void includeAll(TagKey<Block> child) {
            REGISTRATE.addDataGenerator(ProviderType.BLOCK_TAGS, prov -> prov.tag(tag)
                    .addTag(child));
        }

    }

    public enum AllItemTags {


        ;

        public final TagKey<Item> tag;

        AllItemTags() {
            this(MOD);
        }

        AllItemTags(NameSpace namespace) {
            this(namespace, namespace.optionalDefault, namespace.alwaysDatagenDefault);
        }

        AllItemTags(NameSpace namespace, String path) {
            this(namespace, path, namespace.optionalDefault, namespace.alwaysDatagenDefault);
        }

        AllItemTags(NameSpace namespace, boolean optional, boolean alwaysDatagen) {
            this(namespace, null, optional, alwaysDatagen);
        }

        AllItemTags(NameSpace namespace, String path, boolean optional, boolean alwaysDatagen) {
            ResourceLocation id = new ResourceLocation(namespace.id, path == null ? Lang.asId(name()) : path);
            if (optional) {
                tag = optionalTag(ForgeRegistries.ITEMS, id);
            } else {
                tag = ItemTags.create(id);
            }
            if (alwaysDatagen) {
                REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, prov -> prov.tag(tag));
            }
        }

        @SuppressWarnings("deprecation")
        public boolean matches(Item item) {
            return item.builtInRegistryHolder()
                    .is(tag);
        }

        public boolean matches(ItemStack stack) {
            return stack.is(tag);
        }

        public void add(Item... values) {
            REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, prov -> prov.tag(tag)
                    .add(values));
        }

        public void addOptional(Mods mod, String... ids) {
            REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, prov -> {
                TagsProvider.TagAppender<Item> builder = prov.tag(tag);
                for (String id : ids)
                    builder.addOptional(mod.asResource(id));
            });
        }

        public void includeIn(TagKey<Item> parent) {
            REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, prov -> prov.tag(parent)
                    .addTag(tag));
        }

        public void includeIn(AllItemTags parent) {
            includeIn(parent.tag);
        }

        public void includeAll(TagKey<Item> child) {
            REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, prov -> prov.tag(tag)
                    .addTag(child));
        }

    }

    public enum AllFluidTags {

        ICING(FORGE),

        VANILLA_ICING(FORGE),
        BUTTER_CREAM(FORGE),

        PLAIN_CAKE_BATTER(FORGE)


        ;

        public final TagKey<Fluid> tag;

        AllFluidTags() {
            this(MOD);
        }

        AllFluidTags(NameSpace namespace) {
            this(namespace, namespace.optionalDefault, namespace.alwaysDatagenDefault);
        }

        AllFluidTags(NameSpace namespace, String path) {
            this(namespace, path, namespace.optionalDefault, namespace.alwaysDatagenDefault);
        }

        AllFluidTags(NameSpace namespace, boolean optional, boolean alwaysDatagen) {
            this(namespace, null, optional, alwaysDatagen);
        }

        AllFluidTags(NameSpace namespace, String path, boolean optional, boolean alwaysDatagen) {
            ResourceLocation id = new ResourceLocation(namespace.id, path == null ? Lang.asId(name()) : path);
            if (optional) {
                tag = optionalTag(ForgeRegistries.FLUIDS, id);
            } else {
                tag = FluidTags.create(id);
            }
            if (alwaysDatagen) {
                REGISTRATE.addDataGenerator(ProviderType.FLUID_TAGS, prov -> prov.tag(tag));
            }
        }

        @SuppressWarnings("deprecation")
        public boolean matches(Fluid fluid) {
            return fluid.is(tag);
        }

        public boolean matches(FluidState state) {
            return state.is(tag);
        }

        public void add(Fluid... values) {
            REGISTRATE.addDataGenerator(ProviderType.FLUID_TAGS, prov -> prov.tag(tag)
                    .add(values));
        }

        public void includeIn(TagKey<Fluid> parent) {
            REGISTRATE.addDataGenerator(ProviderType.FLUID_TAGS, prov -> prov.tag(parent)
                    .addTag(tag));
        }

        public void includeIn(AllFluidTags parent) {
            includeIn(parent.tag);
        }

        public void includeAll(TagKey<Fluid> child) {
            REGISTRATE.addDataGenerator(ProviderType.FLUID_TAGS, prov -> prov.tag(tag)
                    .addTag(child));
        }

    }

    public static void register() {
        AllFluidTags.BUTTER_CREAM.add(AllFluids.BUTTER_CREAM.get());
        AllFluidTags.VANILLA_ICING.add(AllFluids.VANILLA_ICING.get());

        AllFluidTags.PLAIN_CAKE_BATTER.add(AllFluids.PLAIN_CAKE_BATTER.get());
    }

}
