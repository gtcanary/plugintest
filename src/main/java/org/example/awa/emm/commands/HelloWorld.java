package org.example.awa.emm.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.checkerframework.checker.formatter.qual.ReturnsFormat;

public class HelloWorld implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.BLUE + "Hello World");
        }
        else{
            System.out.println("该指令只能由玩家执行");
        }
        return true;
    }

}
