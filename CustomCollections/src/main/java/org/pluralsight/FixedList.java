package org.pluralsight;

import java.util.List;
import java.util.ArrayList;

public class FixedList<T> {
    List<T> items;
    int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void add(T item) {
        if (items.size() < maxSize) {
            items.add(item);
        }
    }
}
