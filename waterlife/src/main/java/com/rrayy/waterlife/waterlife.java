package com.rrayy.waterlife;

import org.bukkit.event.Listener;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import com.rrayy.waterlife.recipe.recipe;

public class waterlife extends JavaPlugin implements Listener {
    @Override
    public void onEnable(){
        //플러그인 활성화
        getLogger().info("생명수 plugin이 활성화 되었습니다");
        ShapedRecipe recipe1 = ((recipe) recipe.recipe).iron_pack();
        FurnaceRecipe recipe2 = ((recipe) recipe.recipe).water_of_life();
        ShapedRecipe recipe3 = ((recipe) recipe.recipe).sturdy_helmet();
        getServer().addRecipe(recipe1);
        getServer().addRecipe(recipe2);
        getServer().addRecipe(recipe3);
    }

    @Override
    public void onDisable(){
        //플러그인 비활성화
        getLogger().info("생명수 plugin이 비활성화 되었습니다");
    }
}