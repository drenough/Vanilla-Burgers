package net.drenough.vanilla_burgers;

import com.mojang.logging.LogUtils;
import net.drenough.vanilla_burgers.item.ModCreativeModTabs;
import net.drenough.vanilla_burgers.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(VanillaBurgers.MOD_ID)
public class VanillaBurgers {
    public static final String MOD_ID = "vanilla_burgers";
    private static final Logger LOGGER = LogUtils.getLogger();

    public VanillaBurgers(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for mod-loading
        modEventBus.addListener(this::commonSetup);

        // Register server events
        NeoForge.EVENT_BUS.register(this);

        // Register creative tabs
        ModCreativeModTabs.register(modEventBus);

        // Register Items
        ModItems.register(modEventBus);

        // Register client events (safe to register directly - only runs on client)
        modEventBus.addListener(ClientModEvents::onClientSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // Client-side events class
    public static class ClientModEvents{

        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {

            });
        }
    }
}
