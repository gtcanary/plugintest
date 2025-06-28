package org.example.awa.emm.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class clickgui implements Listener {
    @EventHandler
    public void ClickGui(InventoryClickEvent event){
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLACK + "Chunk | 命令帮助")){
            event.setCancelled(true);

        }
    }
}
