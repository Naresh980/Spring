package com.ltp.globalsuperstore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class StoreRepository {

    private List<Item> items = new ArrayList<>();

    public Item getItem(int index) {
        return items.get(index);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void updateItem(Item item, int index) {
        items.set(index, item);
    }

    public List<Item> getItems() {
        return items;
    }


}