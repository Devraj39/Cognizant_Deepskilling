/*
 * Name: Devraj Singh
 * Timestamp: 27-06-2026 06:23 PM
 */

class Car {
    String make;
    String model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class ClassAndObjectCreation {
    public static void main(String[] args) {

        Car car1 = new Car("Honda", "City", 2023);
        Car car2 = new Car("Hyundai", "Verna", 2024);

        car1.displayDetails();
        System.out.println();

        car2.displayDetails();
    }
}