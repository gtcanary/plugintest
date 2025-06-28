package org.example.awa.emm;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.awa.emm.commands.HelloWorld;
import org.example.awa.emm.commands.helpgui;
import org.example.awa.emm.commands.sendMessage;
import org.example.awa.emm.commands.wupin;
import org.example.awa.emm.events.LeaveBed;
import org.example.awa.emm.events.clickgui;
import org.example.awa.emm.events.text;

public final class Emm extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("插件启动成功！");
        getServer().getPluginManager().registerEvents(new LeaveBed(), this);
        getServer().getPluginManager().registerEvents(new text(), this);
        getServer().getPluginManager().registerEvents(new clickgui(), this);

        getCommand("HelloWorld").setExecutor(new HelloWorld());
        getCommand("about").setExecutor(new helpgui());
        getCommand("sendmessage").setExecutor(new sendMessage());
        getCommand("wupin").setExecutor(new wupin());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
