package net.shishkomaster.whm.client.renderer.armor;

import net.shishkomaster.whm.client.model.armor.PowerArmorModel;
import net.shishkomaster.whm.item.PowerArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

    public class PowerArmorRenderer extends GeoArmorRenderer<PowerArmorItem> {
        public PowerArmorRenderer() {
            super(new PowerArmorModel());

            this.headBone = "armorHead";
            this.bodyBone = "armorBody";
            this.rightArmBone = "armorRightArm";
            this.leftArmBone = "armorLeftArm";
            this.rightLegBone = "armorLeftLeg";
            this.leftLegBone = "armorRightLeg";
            this.rightBootBone = "armorLeftBoot";
            this.leftBootBone = "armorRightBoot";
        }

}
