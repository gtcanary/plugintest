package org.example.awa.emm;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.awa.emm.events.LeaveBed;

public final class Emm extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("插件启动成功！");
        getServer().getPluginManager().registerEvents(new LeaveBed(), this);
        //呃呃呃
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
