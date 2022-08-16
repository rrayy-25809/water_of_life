package com.rrayy.waterlife.effect;

import org.bukkit.entity.Player;

import com.rrayy.waterlife.waterlife;

public class effect {
    private waterlife plugin;
    public static Object effect;

    public effect(waterlife plugin) {
        this.plugin = plugin;
    }

    public waterlife getPlugin() {
        return plugin;
    }

    public Player give_effect(Player p){
        int food = p.getFoodLevel();
        p.setFoodLevel(food-1);
        return p;
    }
}
