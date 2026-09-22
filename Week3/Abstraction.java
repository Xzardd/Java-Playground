package Week3;

abstract class Animal {

    abstract void makeSound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.makeSound();
        d.eat();
    }
}