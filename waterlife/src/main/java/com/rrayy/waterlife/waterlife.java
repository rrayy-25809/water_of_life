package com.rrayy.waterlife;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class waterlife extends JavaPlugin implements Listener {
    @Override
    public void onEnable(){
        //플러그인 활성화
        getLogger().info("생명수 plugin이 활성화 되었습니다");

    }

    @Override
    public void onDisable(){
        //플러그인 비활성화
        getLogger().info("생명수 plugin이 비활성화 되었습니다");
    }  
}