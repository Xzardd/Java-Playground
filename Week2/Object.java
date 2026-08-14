class Car {
    String color;
    String brand;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void drive() {
        System.out.println("The " + color + " " + brand + " is now driving.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Red");

        myCar.drive(); 
    }
}
