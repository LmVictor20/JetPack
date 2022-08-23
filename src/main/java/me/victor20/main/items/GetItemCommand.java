package me.victor20.main.items;

import me.victor20.main.iridiumcolorapi.IridiumColorAPI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetItemCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (!player.hasPermission("soe.jetpack")){
            player.sendMessage(IridiumColorAPI.process("<GRADIENT:D0AEF9>У тебя нет прав, чебурашка.</GRADIENT:C289E1>"));
            return  false;
        }
            player.getInventory().addItem(ItemBase.i());
            player.sendMessage(IridiumColorAPI.process( "<GRADIENT:D0AEF9>Предмет выдан!</GRADIENT:C289E1>"));
            return true;

    }
}
