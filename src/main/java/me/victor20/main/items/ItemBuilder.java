package me.victor20.main.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;

public class ItemBuilder  {

    private ItemStack current;

    public ArrayList<String> loreList = new ArrayList<>();

    public ItemBuilder(ItemStack i) {
        this.current = i;
    }

    public ItemBuilder(Material m) {
        this(new ItemStack(m));
    }

    public ItemBuilder(Material m, int amount) {
        this(new ItemStack(m, amount));
    }

    public ItemBuilder(Material m, int amount, short ID) {
        this(new ItemStack(m, amount, ID));
    }

    public ItemBuilder name(String itemname) {
        ItemMeta meta = this.current.getItemMeta();
        meta.setDisplayName(itemname);
        this.current.setItemMeta(meta);
        return this;
    }

    public ItemBuilder lore(String lore) {
        ItemMeta meta = this.current.getItemMeta();
        this.loreList.add(lore);
        meta.setLore(this.loreList);
        this.current.setItemMeta(meta);
        return this;
    }

    public ItemBuilder enchantment(Enchantment ench, int level, boolean bool) {
        ItemMeta meta = this.current.getItemMeta();
        meta.addEnchant(ench, level, bool);
        this.current.setItemMeta(meta);
        return this;
    }

    public ItemBuilder flag(ItemFlag flag) {
        ItemMeta meta = this.current.getItemMeta();
        meta.addItemFlags(new ItemFlag[]{flag});
        this.current.setItemMeta(meta);
        return this;
    }

    public ItemBuilder unbreakable(boolean yep) {
        ItemMeta meta = this.current.getItemMeta();
        meta.setUnbreakable(yep);
        this.current.setItemMeta(meta);
        return this;
    }

    public ItemStack build() {
        return this.current;
    }
}
