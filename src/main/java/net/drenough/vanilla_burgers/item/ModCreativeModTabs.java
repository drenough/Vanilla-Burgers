package net.drenough.vanilla_burgers.item;

import net.drenough.vanilla_burgers.VanillaBurgers;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VanillaBurgers.MOD_ID);

    public static final Supplier<CreativeModeTab> VANILLA_BURGERS_TAB = CREATIVE_MODE_TAB.register("vanilla_burgers_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEAK_BURGER.get()))
                    .title(Component.translatable("creativetab.vanilla_burgers_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STEAK_BURGER.get());
                        output.accept(ModItems.PORK_BURGER.get());
                        output.accept(ModItems.MUTTON_BURGER.get());
                        output.accept(ModItems.CHICKEN_BURGER.get());
                        output.accept(ModItems.RABBIT_BURGER.get());
                        output.accept(ModItems.COD_BURGER.get());
                        output.accept(ModItems.SALMON_BURGER.get());

                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
