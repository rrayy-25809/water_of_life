package com.rrayy.waterlife.effect;

import java.util.concurrent.TimeUnit;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityPotionEffectEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;

import com.rrayy.waterlife.waterlife;

public class effect {
    Player[] el;
    private waterlife plugin;
    public static Object effect;

    public effect(waterlife plugin) {
        this.plugin = plugin;
    }

    public waterlife getPlugin() {
        return plugin;
    }

    public Player give_effect(Player p) throws InterruptedException{
        while (p != null) {
            int food = p.getFoodLevel();
            p.setFoodLevel(food-1);
            TimeUnit.SECONDS.sleep(15);
        }
        return p;
    }

    @EventHandler
    public static final EntityPotionEffectEvent.Cause POTION_DRINK(EntityPotionEffectEvent e, ItemMeta i){
        Entity entity = e.getEntity();
        PotionEffect effect = e.getNewEffect();
        String name = i.getDisplayName();
        if (effect == null && name == ChatColor.GREEN+"생명의 물"){
            entity.remove();
            
        }
        return null;
    }
}
