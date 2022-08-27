package com.rrayy.waterlife;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.rrayy.waterlife.effect.effect;

public class waterlife extends JavaPlugin implements Listener { 
    effect e = new effect();
    @Override
    public void onEnable(){
        //플러그인 활성화
        getLogger().info("생명수 plugin이 활성화 되었습니다");
        iron_pack();
        water_of_life();
        sturdy_helmet();
    }
    @Override
    public void onDisable(){
        //플러그인 비활성화
        getLogger().info("생명수 plugin이 비활성화 되었습니다");
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent p){
        Player py = p.getPlayer();
        e.give_effect(py);
    }

    public void iron_pack(){
        NamespacedKey key = new NamespacedKey(this, "iron_pack");
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.BLUE+"조잡한 철");
        item.setAmount(8);
        item.setItemMeta(meta);
        ShapedRecipe recipe1 = new ShapedRecipe(key, item).shape("III", "ICI", "III");
        recipe1.setIngredient('I', Material.RAW_IRON);
        recipe1.setIngredient('C', Material.COAL);
        getServer().addRecipe(recipe1);
    }

    public void water_of_life(){
        NamespacedKey key = new NamespacedKey(this, "water_of_life");
        ItemStack item = new ItemStack(Material.POTION);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN+"생명의 물");
        item.setItemMeta(meta);
        FurnaceRecipe recipe2 = new FurnaceRecipe(key, item, Material.WATER_BUCKET,40,240);
        //물 양동이를 12초간 구우면 40 경험치와 생명의 물
        getServer().addRecipe(recipe2);
    }

    public void sturdy_helmet(){
        NamespacedKey key = new NamespacedKey(this, "sturdy_helmet");
        ItemStack item = new ItemStack(Material.IRON_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED+"튼튼한 투구");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false); //보호 3
        meta.addEnchant(Enchantment.DURABILITY, 2, false); //내구 2
        //ignoreLevelRestriction 검색해서 정확한 파라미터 값 알아오기
        item.setItemMeta(meta);
        ShapedRecipe recipe3 = new ShapedRecipe(key, item).shape("III", "IRI", "R R");
        recipe3.setIngredient('I', Material.IRON_INGOT);
        recipe3.setIngredient('R', Material.REDSTONE);
        getServer().addRecipe(recipe3);
    }
}