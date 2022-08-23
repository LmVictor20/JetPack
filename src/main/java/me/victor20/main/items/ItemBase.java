package me.victor20.main.items;
import me.victor20.main.iridiumcolorapi.IridiumColorAPI;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
public class ItemBase {

    public static ItemStack i() {
        ItemStack dawd = new ItemStack(Material.RED_MUSHROOM);
        ItemMeta itemMeta = dawd.getItemMeta();
        itemMeta.setDisplayName(IridiumColorAPI.process("<RAINBOW100>JetPack</RAINBOW>"));

        PersistentDataContainer data = itemMeta.getPersistentDataContainer();
        data.set(NamespacedKey.fromString("num"), PersistentDataType.INTEGER, 5);
        dawd.setItemMeta(itemMeta);
        return dawd;



    }



}

