package net.shishkomaster.whm.client.handler;


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.shishkomaster.whm.Whm;
import net.shishkomaster.whm.item.PowerArmorItem;

@Mod.EventBusSubscriber (modid = Whm.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientTickHandler {

    @SubscribeEvent
    public void renderEntityPre(RenderLivingEvent.Pre<?, ?> evt) {
        EntityModel<?> model = evt.getRenderer().getModel();
        if (model instanceof BipedModel) {
            setModelVisibility(evt.getEntity(), (BipedModel<?>) model, false);
        }
    }
    @SubscribeEvent
    public void renderEntityPost(RenderLivingEvent.Post<?, ?> evt) {
        EntityModel<?> model = evt.getRenderer().getModel();
        if (model instanceof BipedModel) {
            setModelVisibility(evt.getEntity(), (BipedModel<?>) model, true);
        }
    }
    private static void setModelVisibility(LivingEntity entity, BipedModel<?> entityModel, boolean showModel) {
        if (entity.getItemBySlot(EquipmentSlotType.HEAD).getItem() instanceof PowerArmorItem) {
            entityModel.head.visible = showModel;
            entityModel.hat.visible = showModel;


        }
        ItemStack chest = entity.getItemBySlot(EquipmentSlotType.CHEST);
        if (chest.getItem() instanceof PowerArmorItem) {
            entityModel.body.visible = showModel;
            if (!(entity instanceof ArmorStandEntity)) {
                entityModel.leftArm.visible = showModel;
                entityModel.rightArm.visible = showModel;
            }
            if (entityModel instanceof PlayerModel) {
                PlayerModel<?> playerModel = (PlayerModel<?>) entityModel;
                playerModel.jacket.visible = showModel;
                playerModel.leftSleeve.visible = showModel;
                playerModel.rightSleeve.visible = showModel;
            }
        }
        if (entity.getItemBySlot(EquipmentSlotType.LEGS).getItem() instanceof PowerArmorItem) {
            entityModel.leftLeg.visible = showModel;
            entityModel.rightLeg.visible = showModel;
            if (entityModel instanceof PlayerModel) {
                PlayerModel<?> playerModel = (PlayerModel<?>) entityModel;
                playerModel.leftPants.visible = showModel;
                playerModel.rightPants.visible = showModel;
            }
        }
    }
}