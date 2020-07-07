package kim.mical.micallib.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class I18n {

    public static String color(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static void log(String message) {
        Bukkit.getConsoleSender().sendMessage(color(message));
    }
}
