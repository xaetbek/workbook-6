package org.pluralsight;

import org.pluralsight.models.Smoothie;
import org.pluralsight.models.Snack;
import org.pluralsight.utils.Basket;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create smoothies
        Smoothie s1 = new Smoothie("Strawberry Dream", 3.50, false, "Strawberry", "Milk");
        Smoothie s2 = new Smoothie("Green Boost", 4.99, true, "Spinach", "Apple", "Mint");
        Smoothie s3 = new Smoothie("Tropical Twist", 4.25, true, "Pineapple", "Mango", "Coconut Water");

        // Add smoothies to a basket
        Basket<Smoothie> smoothieBasket = new Basket<>();
        smoothieBasket.addItem(s1);
        smoothieBasket.addItem(s2);
        smoothieBasket.addItem(s3);

        System.out.println("🍹 Smoothie Basket Receipt:");
        smoothieBasket.printReceipt();
        System.out.println("Total: €" + String.format("%.2f", smoothieBasket.getTotalPrice()));

        // Filter vegan smoothies using a stream
        List<Smoothie> veganSmoothies = smoothieBasket.getItems().stream()
                .filter(Smoothie::isVegan)
                .collect(Collectors.toList());

        System.out.println("\n🥬 Vegan Smoothies:");
        veganSmoothies.forEach(System.out::println);

        // Sort by price using mapToDouble (just printing prices)
        System.out.println("\n💸 Smoothie Prices (sorted using mapToDouble):");
        List<Double> sortedPrices = smoothieBasket.getItems().stream()
                .mapToDouble(Smoothie::getPrice)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        sortedPrices.forEach(price -> {
            // Print the smoothie(s) matching each price
            smoothieBasket.getItems().stream()
                    .filter(s -> s.getPrice() == price)
                    .forEach(s -> System.out.println(s.getName() + ": €" + String.format("%.2f", s.getPrice())));
        });

        // Add snacks to another basket
        Basket<Snack> snackBasket = new Basket<>();
        snackBasket.addItem(new Snack("Cookie", 1.50));
        snackBasket.addItem(new Snack("Muffin", 2.00));
        snackBasket.addItem(new Snack("Brownie", 2.25));

        System.out.println("\n🍪 Snack Basket Receipt:");
        snackBasket.printReceipt();
        System.out.println("Total: €" + String.format("%.2f", snackBasket.getTotalPrice()));
    }
}
