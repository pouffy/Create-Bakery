package com.pouffy.create_bakery.content.items;

import net.minecraft.world.food.FoodProperties;

public class FoodValues {
    public static final FoodProperties PLAIN_CAKE_BASE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.4F).build();
    public static final FoodProperties ICED_PLAIN_CAKE_VANILLA = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.6F).build();
    public static final FoodProperties ICED_PLAIN_CAKE_BUTTERCREAM = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.9F).build();

}
