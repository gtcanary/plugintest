package org.example.awa.emm;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.awa.emm.commands.HelloWorld;
import org.example.awa.emm.events.LeaveBed;
import org.example.awa.emm.events.text;

public final class Emm extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("插件启动成功！");
        getServer().getPluginManager().registerEvents(new LeaveBed(), this);
        getServer().getPluginManager().registerEvents(new text(), this);
        getCommand("HelloWorld").setExecutor((new HelloWorld()));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
