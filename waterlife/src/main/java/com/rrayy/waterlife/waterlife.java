package com.rrayy.waterlife;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
//import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import com.rrayy.waterlife.recipe.recipe;
import com.rrayy.waterlife.effect.effect;

public class waterlife extends JavaPlugin implements Listener {
    @Override
    public void onEnable(){
        //플러그인 활성화
        getLogger().info("생명수 plugin이 활성화 되었습니다");
        getServer().getPluginManager().registerEvents(this, this);
        ShapedRecipe recipe1 = ((recipe) recipe.recipe).iron_pack();
        FurnaceRecipe recipe2 = ((recipe) recipe.recipe).water_of_life();
        ShapedRecipe recipe3 = ((recipe) recipe.recipe).sturdy_helmet();
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
        ((effect) effect.effect).give_effect(py);
    }

    
}