package me.HALD91.Item;

import me.HALD91.Item.Listener.onRightClickItemFrame;
import org.bukkit.plugin.java.JavaPlugin;

public class ItemFrame extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new onRightClickItemFrame(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
