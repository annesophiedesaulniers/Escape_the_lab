package com.example.escape_the_lab.ui;
import com.example.escape_the_lab.model.*;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void useItem(Item item) {
        if (items.contains(item)) {
            // Logic for using the item (e.g., heal the player, etc.)
            item.use();
            items.remove(item);
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public boolean hasItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                return true;
            }
        }
        return false;
    }
}
