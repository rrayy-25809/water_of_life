package com.rrayy.waterlife;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import com.rrayy.waterlife.recipe.recipe;
import com.rrayy.waterlife.effect.effect;

public class waterlife extends JavaPlugin implements Listener {
    private waterlife waterlife;
    recipe r = new recipe(waterlife);
    effect e = new effect(waterlife);
    @Override
    public void onEnable(){
        //플러그인 활성화
        getLogger().info("생명수 plugin이 활성화 되었습니다");
        ShapedRecipe recipe1 = r.iron_pack();
        FurnaceRecipe recipe2 = r.water_of_life();
        ShapedRecipe recipe3 = r.sturdy_helmet();
        getServer().addRecipe(recipe1); //ironpack on
        getServer().addRecipe(recipe2); //wateroflife on
        getServer().addRecipe(recipe3); //sturdyhelmet on
    }

    @Override
    public void onDisable(){
        //플러그인 비활성화
        getLogger().info("생명수 plugin이 비활성화 되었습니다");
    }

    @EventHandler
	public void onJoin(PlayerJoinEvent p) throws InterruptedException {
        Player py = p.getPlayer();
        String pn = py.getName();
        p.setJoinMessage("hi"+pn+"welcome to server");
        e.give_effect(py);
    }

    
}