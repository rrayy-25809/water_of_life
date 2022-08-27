package com.rrayy.waterlife.effect;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityPotionEffectEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;

//import com.rrayy.waterlife.waterlife;

public class effect {
    String[] el;
    

    public void give_effect(Player p){
        String n = p.getName();
        boolean in_el = Arrays.asList(el).contains(n);
        Bukkit.getScheduler().scheduleSyncRepeatingTask((Plugin) this, new Runnable() {
            @Override
            public void run(){
                int food = p.getFoodLevel();
                if (food <= 1 && !in_el) {
                    p.setFoodLevel(food-1);
                    p.sendMessage("배고프당!");
                }else {
                    p.sendMessage("배고프지 않당!");
                }
                    }
        }, 0L, 15*20);
    }

    @EventHandler
    public EntityPotionEffectEvent.Cause POTION_DRINK(EntityPotionEffectEvent e){
        Entity entity = e.getEntity();
        PotionEffect effect = e.getNewEffect();
        String name = entity.getName();
        if (entity.getType() == EntityType.PLAYER && effect == null && !Arrays.asList(el).contains(name)){
            Arrays.asList(el).add(name);
        }
        return null;
    }
}
