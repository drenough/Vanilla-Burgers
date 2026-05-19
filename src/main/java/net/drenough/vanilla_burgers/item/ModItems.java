package net.drenough.vanilla_burgers.item;

import net.drenough.vanilla_burgers.VanillaBurgers;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

@SuppressWarnings("all")
public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(VanillaBurgers.MOD_ID);

    // Burgers
    public static final DeferredItem<Item> STEAK_BURGER = registerItem("steak_burger",
            props -> new Item(props.food(ModFoods.STEAK_BURGER)),
            () -> new Item.Properties());

    public static final DeferredItem<Item> PORK_BURGER = registerItem("pork_burger",
            props -> new Item(props.food(ModFoods.PORK_BURGER)),
            () -> new Item.Properties());

    public static final DeferredItem<Item> CHICKEN_BURGER = registerItem("chicken_burger",
            props -> new Item(props.food(ModFoods.CHICKEN_BURGER)),
            () -> new Item.Properties());

    public static final DeferredItem<Item> RABBIT_BURGER = registerItem("rabbit_burger",
            props -> new Item(props.food(ModFoods.RABBIT_BURGER)),
            () -> new Item.Properties());

    public static final DeferredItem<Item> MUTTON_BURGER = registerItem("mutton_burger",
            props -> new Item(props.food(ModFoods.MUTTON_BURGER)),
            () -> new Item.Properties());

    public static final DeferredItem<Item> COD_BURGER = registerItem("cod_burger",
            props -> new Item(props.food(ModFoods.COD_BURGER)),
            () -> new Item.Properties());

    public static final DeferredItem<Item> SALMON_BURGER = registerItem("salmon_burger",
            props -> new Item(props.food(ModFoods.SALMON_BURGER)),
            () -> new Item.Properties());

    private static <I extends Item> DeferredItem<I> registerItem(String name, Function<Item.Properties, ? extends I> func, Supplier<Item.Properties> properties) {
        return ITEMS.registerItem(name, func, properties);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
