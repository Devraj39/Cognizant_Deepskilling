/*
 * Name: Devraj Singh
 * Timestamp: 27-06-2026 12:46 PM
 */

import java.util.ArrayList;
import java.util.List;

record Person(String name, int age) {}

public class RecordsExample {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Devraj", 21));
        people.add(new Person("Rahul", 18));
        people.add(new Person("Aman", 16));
        people.add(new Person("Priya", 23));

        System.out.println("All Persons:");
        people.forEach(System.out::println);

        System.out.println("\nPersons with age >= 18:");
        people.stream()
              .filter(person -> person.age() >= 18)
              .forEach(System.out::println);
    }
}