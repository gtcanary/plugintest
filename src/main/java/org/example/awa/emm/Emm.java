package org.example.awa.emm;

import org.bukkit.plugin.java.JavaPlugin;

public final class Emm extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("插件启动成功！");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
