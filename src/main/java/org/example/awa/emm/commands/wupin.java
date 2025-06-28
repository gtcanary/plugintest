package org.example.awa.emm.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.ItemMergeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class wupin implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        Player player = (Player) sender;
        ItemStack test_item = new ItemStack(Material.DIAMOND);
        ItemMeta test_item_meta = test_item.getItemMeta();
        test_item_meta.setDisplayName(ChatColor.YELLOW + "好东西");
        ArrayList<String> test_item_lore = new ArrayList<>();
        test_item_lore.add("line1");
        test_item_lore.add("line2");
        test_item_meta.setLore(test_item_lore);
        test_item.setItemMeta(test_item_meta);
        player.getInventory().addItem(test_item);

        return  false;

    }
}
