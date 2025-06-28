package org.example.awa.emm.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class LeaveBed implements Listener {
    @EventHandler
    public void LeaveBed(PlayerBedLeaveEvent event){
        Player player = event.getPlayer();
        player.sendMessage("你离开了床");
    }

}