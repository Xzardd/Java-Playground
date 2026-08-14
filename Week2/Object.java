class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void show() {
        System.out.println(brand + " runs at " + speed + " km/h");
    }
}

public class Object {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 200);
        Car c2 = new Car("Audi", 180);

        c1.show();
        c2.show();
    }
}
