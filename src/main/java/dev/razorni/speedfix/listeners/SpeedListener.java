package dev.razorni.speedfix.listeners;

import dev.razorni.speedfix.SpeedFix;
import dev.razorni.speedfix.utils.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 * Created by DevRazorni
 * 7/14/2021 / 7:07 PM
 * SpeedFix
 */

public class SpeedListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void OnMove(final PlayerMoveEvent event) {
        final Player p = event.getPlayer();
        if (p.getInventory().getBoots() != null) {
            if (p.getInventory().getBoots().hasItemMeta() && p.getInventory().getBoots().getItemMeta().hasLore()) {
                for (String lore : p.getInventory().getBoots().getItemMeta().getLore()) {
                    if (p.getInventory().getBoots().hasItemMeta() && p.getInventory().getBoots().getType() == Material.DIAMOND_BOOTS && lore.contains(Color.translate(SpeedFix.config.getString("SPEED-LORE")))) {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
                    } else {
                        p.removePotionEffect(PotionEffectType.SPEED);
                    }
                }
            }
        }
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onJoin(final PlayerJoinEvent event) {
        final Player p = event.getPlayer();
        if (p.getInventory().getBoots() != null) {
            if (p.getInventory().getBoots().hasItemMeta() && p.getInventory().getBoots().getItemMeta().hasLore()) {
                for (String lore : p.getInventory().getBoots().getItemMeta().getLore()) {
                    if (p.getInventory().getBoots().hasItemMeta() && p.getInventory().getBoots().getType() == Material.DIAMOND_BOOTS && lore.contains(Color.translate(SpeedFix.config.getString("SPEED-LORE")))) {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
                    } else {
                        p.removePotionEffect(PotionEffectType.SPEED);
                    }
                }
            }
        }
    }

}
