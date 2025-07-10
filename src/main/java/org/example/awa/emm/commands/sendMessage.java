package org.example.awa.emm.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sendMessage implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (sender instanceof Player){
            Bukkit.getLogger().info("玩家执行了指令。");
            if (args.length == 1){
                String message = args[0];
                Player player = (Player) sender;
                player.sendMessage(ChatColor.BLUE + "你说了：" + message);
            }
            else{
                Player player = (Player) sender;
                player.sendMessage(ChatColor.RED + "语法错误");
                player.sendMessage(ChatColor.RED + "usage: /sendmessage + 文本");
            }

        }
        else{
            Bukkit.getLogger().warning("该指令只能由玩家执行");
        }
        return false;
    }
}
