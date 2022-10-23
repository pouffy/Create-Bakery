package com.pouffy.create_bakery.registry;

import com.pouffy.create_bakery.CreateBakery;
import com.pouffy.create_bakery.content.items.FoodValues;
import com.pouffy.create_bakery.data.CreateBakeryRegistrate;
import com.simibubi.create.AllTags;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
@SuppressWarnings("unused")
public class AllItems {
    private static final CreateRegistrate REGISTRATE = CreateBakery.registrate()
            .creativeModeTab(() -> CreateBakery.BASE_CREATIVE_TAB);

    public static final ItemEntry<Item> BUTTER = REGISTRATE.item("butter", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB))
            .lang("Butter")
            .register();
    public static final ItemEntry<Item> ICING_SUGAR = REGISTRATE.item("icing_sugar", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB))
            .lang("Icing Sugar")
            .register();
    public static final ItemEntry<Item> CAKE_TIN = REGISTRATE.item("cake_tin", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).stacksTo(16))
            .lang("Cake Tin")
            .register();
    public static final ItemEntry<Item> FILLED_CAKE_TIN_PLAIN = REGISTRATE.item("filled_cake_tin_plain", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).stacksTo(16))
            .lang("Filled Cake Tin")
            .register();
    public static final ItemEntry<Item> FILLED_CAKE_TIN_PLAIN_COOKED = REGISTRATE.item("filled_cake_tin_plain_cooked", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).craftRemainder(AllItems.CAKE_TIN.get()).stacksTo(16))
            .lang("Baked Filled Cake Tin")
            .register();
    public static final ItemEntry<Item> PLAIN_CAKE_BASE = REGISTRATE.item("plain_cake_base", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.PLAIN_CAKE_BASE).stacksTo(16))
            .lang("Plain Cake Base")
            .register();
    public static final ItemEntry<Item> SMALL_CAKE_TIN = REGISTRATE.item("small_cake_tin", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).stacksTo(32))
            .lang("Small Cake Tin")
            .register();
    public static final ItemEntry<Item> FILLED_SMALL_CAKE_TIN_PLAIN = REGISTRATE.item("filled_small_cake_tin_plain", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).stacksTo(32))
            .lang("Filled Small Cake Tin")
            .register();
    public static final ItemEntry<Item> FILLED_SMALL_CAKE_TIN_PLAIN_COOKED = REGISTRATE.item("filled_small_cake_tin_plain_cooked", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).craftRemainder(AllItems.SMALL_CAKE_TIN.get()).stacksTo(32))
            .lang("Baked Filled Small Cake Tin")
            .register();
    public static final ItemEntry<Item> PLAIN_SMALL_CAKE_BASE = REGISTRATE.item("plain_small_cake_base", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.PLAIN_CAKE_BASE).stacksTo(32))
            .lang("Plain Small Cake Base")
            .register();
    public static final ItemEntry<Item> HALF_CAKE_TIN = REGISTRATE.item("half_cake_tin", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).stacksTo(32))
            .lang("Half Cake Tin")
            .register();
    public static final ItemEntry<Item> FILLED_HALF_CAKE_TIN_PLAIN = REGISTRATE.item("filled_half_cake_tin_plain", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).stacksTo(32))
            .lang("Filled Half Cake Tin")
            .register();
    public static final ItemEntry<Item> FILLED_HALF_CAKE_TIN_PLAIN_COOKED = REGISTRATE.item("filled_half_cake_tin_plain_cooked", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).craftRemainder(AllItems.SMALL_CAKE_TIN.get()).stacksTo(32))
            .lang("Baked Filled Half Cake Tin")
            .register();
    public static final ItemEntry<Item> PLAIN_HALF_CAKE_BASE = REGISTRATE.item("plain_half_cake_base", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.PLAIN_CAKE_BASE).stacksTo(32))
            .lang("Plain Half Cake Base")
            .register();
    public static final ItemEntry<Item> SWEET_BERRY_JAMMED_HALF_PLAIN_CAKE = REGISTRATE.item("sweet_berry_jammed_half_plain_cake", Item::new)
            .properties(p->p.food(FoodValues.PLAIN_CAKE_BASE).stacksTo(32))
            .lang("Sweet Berry Jammed Half Plain Cake")
            .register();
    public static final ItemEntry<Item> SWEET_BERRY_JAM_STUFFED_PLAIN_CAKE = REGISTRATE.item("sweet_berry_jam_stuffed_plain_cake", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.PLAIN_CAKE_BASE).stacksTo(32))
            .lang("Sweet Berry Jam Stuffed Plain Cake")
            .register();
    public static final ItemEntry<ItemNameBlockItem> VANILLA = REGISTRATE.item("vanilla", properties -> new ItemNameBlockItem(AllBlocks.VANILLA_CROP.get(), properties))
            .initialProperties(() -> new Item.Properties().tab(CreateBakery.BASE_CREATIVE_TAB))
            .register();

    public static final ItemEntry<Item> BOTTLED_VANILLA_EXTRACT = REGISTRATE.item("bottled_vanilla_extract",Item::new)
            .initialProperties(() -> new Item.Properties().tab(CreateBakery.BASE_CREATIVE_TAB))
            .register();

    public static final ItemEntry<ItemNameBlockItem> ICED_PLAIN_CAKE_VANILLA = REGISTRATE.item("iced_plain_cake_vanilla", properties -> new ItemNameBlockItem(AllBlocks.VANILLA_CAKE.get(), properties))
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).stacksTo(1))
            .lang("Vanilla Iced Cake")
            .register();
    public static final ItemEntry<ItemNameBlockItem> ICED_PLAIN_CAKE_BUTTERCREAM = REGISTRATE.item("iced_plain_cake_buttercream", properties -> new ItemNameBlockItem(AllBlocks.BUTTERCREAM_CAKE.get(), properties))
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).stacksTo(1))
            .lang("ButterCream Iced Cake")
            .register();
    public static final ItemEntry<ItemNameBlockItem> ICED_PLAIN_CAKE_CHOCOLATE = REGISTRATE.item("iced_plain_cake_chocolate", properties -> new ItemNameBlockItem(AllBlocks.CHOCOLATE_CAKE.get(), properties))
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).stacksTo(1))
            .lang("Chocolate Iced Cake")
            .register();
    public static final ItemEntry<Item> ICED_PLAIN_SMALL_CAKE_VANILLA = REGISTRATE.item("iced_plain_small_cake_vanilla", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.ICED_PLAIN_CAKE_VANILLA).stacksTo(1))
            .lang("Vanilla Iced Small Cake")
            .register();
    public static final ItemEntry<Item> ICED_PLAIN_SMALL_CAKE_BUTTERCREAM = REGISTRATE.item("iced_plain_small_cake_buttercream", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.ICED_PLAIN_CAKE_BUTTERCREAM).stacksTo(1))
            .lang("ButterCream Iced Small Cake")
            .register();
    public static final ItemEntry<Item> ICED_PLAIN_SMALL_CAKE_CHOCOLATE = REGISTRATE.item("iced_plain_small_cake_chocolate", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.ICED_PLAIN_CAKE_BUTTERCREAM).stacksTo(1))
            .lang("Chocolate Iced Small Cake")
            .register();
    public static final ItemEntry<Item> DOUBLE_PLAIN_CAKE_BASE = REGISTRATE.item("double_plain_cake_base", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.PLAIN_CAKE_BASE).stacksTo(8))
            .lang("Double Plain Cake Base")
            .register();
    public static final ItemEntry<Item> ICED_DOUBLE_PLAIN_CAKE_VANILLA = REGISTRATE.item("iced_double_plain_cake_vanilla", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.ICED_PLAIN_CAKE_VANILLA).stacksTo(1))
            .lang("Vanilla Iced Double Cake")
            .register();
    public static final ItemEntry<Item> ICED_DOUBLE_PLAIN_CAKE_BUTTERCREAM = REGISTRATE.item("iced_double_plain_cake_buttercream", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.ICED_PLAIN_CAKE_BUTTERCREAM).stacksTo(1))
            .lang("ButterCream Iced Double Cake")
            .register();
    public static final ItemEntry<Item> ICED_DOUBLE_PLAIN_CAKE_CHOCOLATE = REGISTRATE.item("iced_double_plain_cake_chocolate", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.ICED_PLAIN_CAKE_BUTTERCREAM).stacksTo(1))
            .lang("Chocolate Iced Double Cake")
            .register();
    public static final ItemEntry<Item> ICED_DOUBLE_PLAIN_CAKE_VANILLA_BUTTERCREAM = REGISTRATE.item("iced_double_plain_cake_vanilla_butter_cream", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.ICED_PLAIN_CAKE_VANILLA).stacksTo(1))
            .lang("Vanilla-ButterCream Iced Double Cake")
            .register();
    public static final ItemEntry<Item> ICED_DOUBLE_PLAIN_CAKE_BUTTERCREAM_VANILLA = REGISTRATE.item("iced_double_plain_cake_buttercream_vanilla", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.ICED_PLAIN_CAKE_BUTTERCREAM).stacksTo(1))
            .lang("ButterCream-Vanilla Iced Double Cake")
            .register();
    public static final ItemEntry<Item> ICED_DOUBLE_PLAIN_CAKE_CHOCOLATE_BUTTERCREAM = REGISTRATE.item("iced_double_plain_cake_chocolate_butter_cream", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.ICED_PLAIN_CAKE_BUTTERCREAM).stacksTo(1))
            .lang("Chocolate-ButterCream Iced Double Cake")
            .register();
    public static final ItemEntry<Item> ICED_DOUBLE_PLAIN_CAKE_VANILLA_CHOCOLATE = REGISTRATE.item("iced_double_plain_cake_vanilla_chocolate", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.ICED_PLAIN_CAKE_VANILLA).stacksTo(1))
            .lang("Vanilla-Chocolate Iced Double Cake")
            .register();
    public static final ItemEntry<Item> ICED_DOUBLE_PLAIN_CAKE_BUTTERCREAM_CHOCOLATE = REGISTRATE.item("iced_double_plain_cake_buttercream_chocolate", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.ICED_PLAIN_CAKE_BUTTERCREAM).stacksTo(1))
            .lang("ButterCream-Chocolate Iced Double Cake")
            .register();
    public static final ItemEntry<Item> ICED_DOUBLE_PLAIN_CAKE_CHOCOLATE_VANILLA = REGISTRATE.item("iced_double_plain_cake_chocolate_vanilla", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.ICED_PLAIN_CAKE_BUTTERCREAM).stacksTo(1))
            .lang("Chocolate-Vanilla Iced Double Cake")
            .register();
    //NETHER DIVISION
    public static final ItemEntry<Item> GILDED_HALF_CAKE_TIN = REGISTRATE.item("gilded_half_cake_tin", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).stacksTo(32))
            .lang("Gilded Half Cake Tin")
            .register();
    public static final ItemEntry<Item> FILLED_GILDED_HALF_CAKE_TIN_BLAZE = REGISTRATE.item("filled_gilded_half_cake_tin_blaze", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).stacksTo(32))
            .lang("Filled Gilded Half Cake Tin")
            .register();
    public static final ItemEntry<Item> FILLED_GILDED_HALF_CAKE_TIN_BLAZE_COOKED = REGISTRATE.item("filled_gilded_half_cake_tin_blaze_cooked", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).craftRemainder(AllItems.SMALL_CAKE_TIN.get()).stacksTo(32))
            .lang("Baked Filled Gilded Half Cake Tin")
            .register();
    public static final ItemEntry<Item> BLAZING_HALF_CAKE_BASE = REGISTRATE.item("blazing_half_cake_base", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.PLAIN_CAKE_BASE).stacksTo(32))
            .lang("Blazing Half Cake Base")
            .register();
    public static final ItemEntry<Item> GLOW_BERRY_JAMMED_HALF_BLAZE_CAKE = REGISTRATE.item("glow_berry_jammed_half_blaze_cake", Item::new)
            .properties(p->p.food(FoodValues.PLAIN_CAKE_BASE).stacksTo(32))
            .lang("Glow Berry Jammed Half Blaze Cake")
            .register();
    public static final ItemEntry<Item> GLOW_BERRY_JAM_STUFFED_BLAZE_CAKE = REGISTRATE.item("glow_berry_jam_stuffed_blaze_cake", Item::new)
            .properties(p->p.tab(CreateBakery.BASE_CREATIVE_TAB).food(FoodValues.PLAIN_CAKE_BASE).stacksTo(32))
            .lang("Glow Berry Jam Stuffed Blaze Cake")
            .register();
    public static void register() {}
}
