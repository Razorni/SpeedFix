package dev.razorni.speedfix.utils;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Color {

    public static String translate(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public static void toSender(CommandSender sender, String text) {
        sender.sendMessage(Color.translate(text));
    }

    public static void toPlayer(Player player, String text) {
        player.sendMessage(Color.translate(text));
    }

    public static void toList(List<String> list, String text) {
        list.add(Color.translate(text));
    }

    public static List<String> translateFromArrayList(List<String> stringList) {
        List<String> arrayList = new ArrayList<>();
        for (String list : stringList) {
            arrayList.add(Color.translate(list));
        }
        return arrayList;
    }

    public static String strip(String text) {
        return ChatColor.stripColor(text);
    }

}
