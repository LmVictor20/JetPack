package me.victor20.main.ChatUtil;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ChatUtil extends JavaPlugin {

    public static String transformByCount(int amount, String uno, String duo, String many) {
        int mod10 = amount % 10, mod100 = amount % 100;
        if (mod10 == 1 && mod100 != 11) {
            return uno;
        }
        if (mod10 >= 2 && mod10 <= 4 && (mod100 < 10 || mod100 > 20)) {
            return duo;
        }
        return many;
    }

    public static String colorize(String message, Object... arguments) {
        if (message == null) {
            return null;
        }
        if (arguments.length > 0) {
            message = String.format(message, arguments);
        }
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static String uncolorize(String message) {
        return message == null ? null : ChatColor.stripColor(colorize(message));
    }

    public static List<String> colorize(Collection<String> text) {
        List<String> returnText = new ArrayList<>();
        for (String line : text) {
            returnText.add(colorize(line));
        }
        return returnText;
    }
    }

