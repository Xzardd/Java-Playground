package Week3;


//types of inheritance java supports
/*
Simple
multi level
heirarchy

one more is there multiple inheritance(diamond problem) which java does not support but can be done using interafces

*/

/*

Super key word is also there which is used to call items from parent class 
items like methods constructors and variables */

public class Inheritance {

    
public static void main(String[] args) {



    Vehicle vh = new Vehicle();
    vh.power();


    Car c = new Car();
    c.gear();
    c.power();

    

}
}

class Vehicle{
  void power(){
    System.out.println("Engine Type");
  }

}

class Car extends Vehicle {
    void gear(){
        System.out.println("5 gears available");
    }
}
