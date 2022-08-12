package me.HALD91.Item.Listener;

import org.bukkit.Material;
import org.bukkit.Rotation;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

public class onRightClickItemFrame implements Listener {
    @EventHandler
    public void paintingRotate(final PlayerInteractEntityEvent event) {
        final Entity clicked = event.getRightClicked();
        if (clicked != null && clicked instanceof ItemFrame) {
            ((ItemFrame) clicked).setRotation(Rotation.COUNTER_CLOCKWISE_45);
            final ItemFrame frame = (ItemFrame) clicked;
            //frame.setRotation(Rotation.NONE);
            if (frame.getItem() != null) {
                final ItemStack item = frame.getItem();
                event.getPlayer().getInventory().addItem(item);
            }
        }
    }
}
