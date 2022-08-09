package com.rrayy.waterlife.recipe;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import com.rrayy.waterlife.waterlife;


public class recipe {
    private waterlife plugin;
    public text_manager(waterlife plugin) {
        this.plugin = plugin;
    }
    public void iron_pack() {
        NamespacedKey key = new NamespacedKey(this, "iron_pack");
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.BLUE+"조잡한 철");
        item.setItemMeta(meta);
        item.setAmount(9);
        ShapedRecipe recipe1 = new ShapedRecipe(key, item).shape("III", "ICI", "III");
        recipe1.setIngredient('I', Material.RAW_IRON);
        recipe1.setIngredient('C', Material.COAL);
        getServer().addRecipe(recipe1);
    }
    public void water_of_life() {
        NamespacedKey key = new NamespacedKey(this, "water_of_life");
        ItemStack item = new ItemStack(Material.POTION);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN+"생명의 물");
        item.setItemMeta(meta);
        FurnaceRecipe recipe2 = new FurnaceRecipe(item, Material.WATER_BUCKET);
        getServer().addRecipe(recipe2);
    }
}