package com.rrayy.waterlife.event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPotionEffectEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import com.rrayy.waterlife.effect.effect;

public class event implements Listener{
    effect e = new effect();

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        System.out.println("test");
        Player player = event.getPlayer();
        event.setJoinMessage(player.getDisplayName()+"님께서 갈증을 느낍니다");
        e.give_effect(player);
    }

    @EventHandler
    public EntityPotionEffectEvent.Cause POTION_DRINK(EntityPotionEffectEvent event){
        e.drink_waterlife(event);
        return null;
    }
}
