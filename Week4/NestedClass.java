

package Week4;

class Elephant {
    String name = "Raja";

    class Cub {
        String name = "Moti";

        void display() {
            System.out.println("Elephant: " + Elephant.this.name);
            System.out.println("Cub: " + name);
        }
    }

    void showCub() {
        Cub cub = new Cub();
        cub.display();
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        elephant.showCub();
    }
}