package Week3;

//Polymorphism means many forms
//same object behaves diff on same command if one param is changed

class Calculator {

    // Compile-time polymorphism (Method Overloading)
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }
}


class ACalculator extends Calculator {

    // Run-time polymorphism (Method Overriding)
    @Override
    void add(int a, int b) {
        System.out.println("Advanced Sum: " + (a + b));
    }
}


public class Polymorphism {
    public static void main(String[] args) {

        // Compile-time polymorphism
        Calculator c1 = new Calculator();
        c1.add(10, 20);
        c1.add(10, 20, 30);


        // Run-time polymorphism
        Calculator c2 = new ACalculator();
        c2.add(10, 20);
    }
}