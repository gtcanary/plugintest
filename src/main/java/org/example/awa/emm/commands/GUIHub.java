package org.example.awa.emm.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GUIHub {
    public static void main_gui(Player player){
        //New Inventory
        Inventory GUI = Bukkit.createInventory(player, 9, ChatColor.BLACK + "Chunk | 命令帮助");

        //New Items
        ItemStack skins = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta skins_meta = skins.getItemMeta();
        skins_meta.setDisplayName(ChatColor.AQUA + "更改皮肤");
        ArrayList<String> skins_lore = new ArrayList<>();
        skins_lore.add(ChatColor.WHITE + "/skin <正版皮肤名>");
        skins_lore.add(ChatColor.WHITE + "/skin url <皮肤图片URL（必须png格式）>");
        skins_meta.setLore(skins_lore);
        skins.setItemMeta(skins_meta);


        ItemStack cdks = new ItemStack(Material.GOLD_INGOT);
        ItemMeta cdks_meta = cdks.getItemMeta();
        cdks_meta.setDisplayName(ChatColor.AQUA + "物品兑换");
        ArrayList<String> cdks_lore = new ArrayList<>();
        cdks_lore.add(ChatColor.WHITE + "/cdk use <兑换码>");
        cdks_meta.setLore(cdks_lore);
        cdks.setItemMeta(cdks_meta);

        ItemStack touxian = new ItemStack(Material.PAPER);
        ItemMeta touxian_meta = touxian.getItemMeta();
        touxian_meta.setDisplayName(ChatColor.AQUA + "设置头衔");
        ArrayList<String> touxian_lore = new ArrayList<>();
        touxian_lore.add(ChatColor.WHITE + "/plt open");
        touxian_meta.setLore(touxian_lore);
        touxian.setItemMeta(touxian_meta);


        //设置物品栏
        GUI.setItem(0,skins);
        GUI.setItem(1,cdks);
        GUI.setItem(2,touxian);
        player.openInventory(GUI);

    }

    public static void confirm_gui(Player player){
        Inventory Confirm_gui = Bukkit.createInventory(player, 9, ChatColor.BLACK + "你确定吗");

        ItemStack confirm = new ItemStack(Material.EMERALD);
        ItemStack cancel = new ItemStack(Material.BARRIER);

        ItemMeta confirm_meta = confirm.getItemMeta();
        ItemMeta cancel_meta = cancel.getItemMeta();

        confirm.getItemMeta().setDisplayName(ChatColor.GREEN + "Confirm");
        cancel.getItemMeta().setDisplayName(ChatColor.RED + "Cancel");

        confirm.setItemMeta(confirm_meta);
        cancel.setItemMeta(cancel_meta);

        Confirm_gui.setItem(3,confirm);
        Confirm_gui.setItem(5,cancel);

        player.openInventory(Confirm_gui);

    }
}
