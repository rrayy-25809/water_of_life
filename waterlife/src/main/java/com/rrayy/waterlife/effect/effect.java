package com.rrayy.waterlife.effect;

import java.util.concurrent.TimeUnit;

import org.bukkit.entity.Player;

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
}
