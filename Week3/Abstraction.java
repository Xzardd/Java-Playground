package Week3;


abstract class CarX {

    void start(){
        System.out.println("Car started");
    }

    abstract void accelerate();

    abstract void  stopping();
}

class ElectricCar extends CarX{

@Override 
    void accelerate(){
        System.out.println("E-car Moving");


    }
@Override 
    void stopping(){
        System.out.println("E-car Stopped");

    }
}

class FuelCar extends CarX{

@Override 
    void accelerate(){
        System.out.println("F-car Moving");


    }
@Override 
    void stopping(){
        System.out.println("F-car Stopped");

    }
}



public class Abstraction {
    public static void main(String[] args) {

        CarX carX = new FuelCar();
        carX.start();
        carX.accelerate();
        carX.stopping();

        CarX carX2 = new ElectricCar();
        carX2.start();
        carX2.accelerate();
        carX2.stopping();





    }
}