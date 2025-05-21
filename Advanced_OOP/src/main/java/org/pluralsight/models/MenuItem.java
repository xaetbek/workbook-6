package org.pluralsight.models;

public class MenuItem<T> {
    private String label;
    private T product;

    public MenuItem(String label, T product) {
        this.label = label;
        this.product = product;
    }

    public String getLabel() { return label; }

    public T getProduct() { return product; }
}
