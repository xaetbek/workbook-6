package org.pluralsight.models;
import org.pluralsight.interfaces.PricedItem;

import java.util.Arrays;
import java.util.List;

public class Smoothie implements PricedItem {
    private String name;
    private double price;
    private boolean isVegan;
    private List<String> ingredients;

    public Smoothie(String name, double price, boolean isVegan, String... ingredients) {
        this.name = name;
        this.price = price;
        this.isVegan = isVegan;
        this.ingredients = Arrays.asList(ingredients);
    }

    @Override
    public String getName() { return name; }

    @Override
    public double getPrice() { return price; }

    public boolean isVegan() { return isVegan; }

    public List<String> getIngredients() { return ingredients; }

    @Override
    public String toString() {
        return name + " (€" + String.format("%.2f", price) + (isVegan ? ", Vegan" : "") +
                ", Ingredients: " + ingredients + ")";
    }
}
