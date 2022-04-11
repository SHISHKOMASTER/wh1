package net.shishkomaster.whm.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.shishkomaster.whm.Whm;
import net.shishkomaster.whm.client.renderer.armor.PowerArmorRenderer;
import net.shishkomaster.whm.item.PowerArmorItem;
import software.bernie.example.GeckoLibMod;
import software.bernie.example.client.renderer.entity.ExampleGeoRenderer;
import software.bernie.example.registry.EntityRegistry;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = Whm.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientListener {

    @SubscribeEvent
    public static void registerRenderers(final FMLClientSetupEvent event) {

            GeoArmorRenderer.registerArmorRenderer(PowerArmorItem.class, new PowerArmorRenderer());

    }
}


