package com.example;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class HelpMePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("helpme").setExecutor(new HelpCommand());
        getLogger().info("HelpMePlugin включен!");
    }

    @Override
    public void onDisable() {
        getLogger().info("HelpMePlugin выключен!");
    }

    public class HelpCommand implements CommandExecutor {
        @Override
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (sender.hasPermission("helpme.use")) {
                sender.sendMessage("§eПомощь: §fИспользуйте /warp, чтобы телепортироваться на спавн.");
                return true;
            } else {
                sender.sendMessage("§cУ вас нет прав на использование этой команды.");
                return false;
            }
        }
    }
}
