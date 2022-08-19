package com.rrayy.waterlife.recipe;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import com.rrayy.waterlife.waterlife;


public class recipe {
    public static Object recipe;
    private waterlife plugin;

    public waterlife getPlugin() {
        return plugin;
    }

    public recipe(waterlife plugin) {
        this.plugin = plugin;
    }

    public ShapedRecipe iron_pack() {
        NamespacedKey key = new NamespacedKey((Plugin)this, "iron_pack");
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.BLUE+"조잡한 철");
        item.setItemMeta(meta);
        item.setAmount(9);
        ShapedRecipe recipe1 = new ShapedRecipe(key, item).shape("III", "ICI", "III");
        recipe1.setIngredient('I', Material.RAW_IRON);
        recipe1.setIngredient('C', Material.COAL);
        return recipe1;
    }

    public FurnaceRecipe water_of_life() {
        NamespacedKey key = new NamespacedKey((Plugin) this, "water_of_life");
        ItemStack item = new ItemStack(Material.POTION);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN+"생명의 물");
        item.setItemMeta(meta);
        FurnaceRecipe recipe2 = new FurnaceRecipe(key, item, Material.WATER_BUCKET,50,5);
        //물 양동이를 5초간 구우면 50 경험치와 생명의 물
        return recipe2;
    }

    public ShapedRecipe sturdy_helmet() {
        NamespacedKey key = new NamespacedKey((Plugin) this, "sturdy_helmet");
        ItemStack item = new ItemStack(Material.IRON_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED+"튼튼한 투구");
        item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3); //보호 3
        item.addEnchantment(Enchantment.DURABILITY, 2); //내구 2
        item.setItemMeta(meta);
        ShapedRecipe recipe3 = new ShapedRecipe(key, item).shape("III", "IRI", "R R");
        recipe3.setIngredient('I', Material.IRON_INGOT);
        recipe3.setIngredient('R', Material.REDSTONE);
        return recipe3;
    }
}