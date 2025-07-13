package org.example.awa.emm.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.example.awa.emm.commands.GUIHub;

public class clickgui implements Listener {
    @EventHandler
    public void ClickGui(InventoryClickEvent event){
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLACK + "Chunk | 命令帮助")){
            event.setCancelled(true);

            try{
                if (event.getCurrentItem().getType().equals(Material.DIAMOND_SWORD)){
                    Player player = (Player) event.getWhoClicked();
                    GUIHub.confirm_gui(player);
                }
            }
            catch(NullPointerException ignored) {}
            }
        else if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLACK + "你确定吗")){
            event.setCancelled(true);
            try{
                Player player = (Player) event.getWhoClicked();
                if(event.getCurrentItem().getType().equals(Material.EMERALD)){
                    player.sendMessage("2333");
                    player.closeInventory();
                }
                else if(event.getCurrentItem().getType().equals(Material.BARRIER)){
                    GUIHub.main_gui(player);
                }
            }
            catch(NullPointerException ignored) {}
        }

        }
    }
