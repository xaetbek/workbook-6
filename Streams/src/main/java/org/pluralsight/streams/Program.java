package org.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Smith", 25));
        people.add(new Person("Sarah", "Johnson", 32));
        people.add(new Person("Michael", "Williams", 45));
        people.add(new Person("Emily", "Brown", 28));
        people.add(new Person("David", "Jones", 37));
        people.add(new Person("Lisa", "Garcia", 29));
        people.add(new Person("James", "Miller", 41));
        people.add(new Person("Jennifer", "Davis", 33));
        people.add(new Person("Robert", "Rodriguez", 39));
        people.add(new Person("Jessica", "Martinez", 31));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name to search for (first or last name): ");
        String name = scanner.nextLine();

        // Find people with matching names using streams
//        System.out.println("\nMatching people (using streams):");
//        people.stream()
//                .filter(person ->
//                        person.getFirstName().toLowerCase().contains(name.toLowerCase()) ||
//                                person.getLastName().toLowerCase().contains(name.toLowerCase()))
//                .forEach(person ->
//                        System.out.println(person.getFirstName() + " " + person.getLastName()));

        // Find people with matching names using for loop
        System.out.println("\nMatching people (using for loop):");
        List<Person> matches = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().toLowerCase().contains(name.toLowerCase()) ||
                    person.getLastName().toLowerCase().contains(name.toLowerCase())) {
                matches.add(person);
            }
        }
        for (Person match : matches) {
            System.out.println(match.getFirstName() + " " + match.getLastName());
        }


        System.out.print("\nAverage age: ");
        int sum = 0;
        for (Person person : people) {
            sum += person.getAge();
        }
        System.out.println(people.isEmpty() ? 0 : (double) sum / people.size());

        System.out.print("Oldest person: ");
        int maxAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
        }
        System.out.println(people.isEmpty() ? 0 : maxAge);

        System.out.print("Youngest person: ");
        int minAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() < minAge) {
                minAge = person.getAge();
            }
        }
        System.out.println(people.isEmpty() ? 0 : minAge);

        // Alternative way to calculate average age and oldest/youngest person using streams
//        System.out.print("\nAverage age: ");
//        System.out.println(people.stream()
//                .mapToInt(Person::getAge)
//                .average()
//                .orElse(0));
//
//        System.out.print("Oldest person: ");
//        System.out.println(people.stream()
//                .mapToInt(Person::getAge)
//                .max()
//                .orElse(0));
//
//        System.out.print("Youngest person: ");
//        System.out.println(people.stream()
//                .mapToInt(Person::getAge)
//                .min()
//                .orElse(0));
    }
}