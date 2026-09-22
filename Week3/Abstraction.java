package Week3;

abstract class Vehicle {

    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();
    abstract void stop();

    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    void start() {
        System.out.println("Car starts with a key");
    }

    void stop() {
        System.out.println("Car stops using brakes");
    }
}

class Bike extends Vehicle {

    Bike(String brand) {
        super(brand);
    }

    void start() {
        System.out.println("Bike starts with a button");
    }

    void stop() {
        System.out.println("Bike stops using brakes");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Car car = new Car("Toyota");
        Bike bike = new Bike("Yamaha");

        car.showBrand();
        car.start();
        car.stop();

        System.out.println();

        bike.showBrand();
        bike.start();
        bike.stop();
    }
}