package org.pluralsight.utils;

import org.pluralsight.interfaces.PricedItem;

import java.util.ArrayList;
import java.util.List;

public class Basket<T extends PricedItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(PricedItem::getPrice)
                .sum();
    }

    public void printReceipt() {
        items.forEach(item ->
                System.out.println(item.getName() + ": €" + String.format("%.2f", item.getPrice()))
        );
    }

    public List<T> getItems() {
        return items;
    }
}
