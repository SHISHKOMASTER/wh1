package net.shishkomaster.whm.client.model.armor;

import net.minecraft.util.ResourceLocation;
import net.shishkomaster.whm.Whm;
import net.shishkomaster.whm.item.PowerArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PowerArmorModel extends AnimatedGeoModel<PowerArmorItem> {

    @Override
    public ResourceLocation getModelLocation(PowerArmorItem object) {
        return new ResourceLocation(Whm.MOD_ID, "geo/power_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PowerArmorItem object) {
        return new ResourceLocation(Whm.MOD_ID, "textures/item/power_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PowerArmorItem animatable) {
        return new ResourceLocation(Whm.MOD_ID, "animations/power_armor_mk7.animation.json");
    }

}
