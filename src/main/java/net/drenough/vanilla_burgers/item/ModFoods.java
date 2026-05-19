package net.drenough.vanilla_burgers.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STEAK_BURGER = new FoodProperties.Builder()
            .nutrition(14)
            .saturationModifier(1.4F)
            .build();

    public static final FoodProperties PORK_BURGER = new FoodProperties.Builder()
            .nutrition(14)
            .saturationModifier(1.4F)
            .build();

    public static final FoodProperties MUTTON_BURGER = new FoodProperties.Builder()
            .nutrition(13)
            .saturationModifier(1.2F)
            .build();

    public static final FoodProperties CHICKEN_BURGER = new FoodProperties.Builder()
            .nutrition(13)
            .saturationModifier(1.2F)
            .build();

    public static final FoodProperties SALMON_BURGER = new FoodProperties.Builder()
            .nutrition(13)
            .saturationModifier(1.2F)
            .build();

    public static final FoodProperties COD_BURGER = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(1.1F)
            .build();

    public static final FoodProperties RABBIT_BURGER = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(1.1F)
            .build();
}