

package Week4;

class Elephant {
    private String name;
    private int age;

    Elephant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    class Cub {
        private String name;
        private int age;

        Cub(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Mother Elephant: " + Elephant.this.name);
            System.out.println("Mother Age: " + Elephant.this.age);
            System.out.println("Cub Name: " + this.name);
            System.out.println("Cub Age: " + this.age);
        }

        void grow() {
            age++;
        }
    }

    void showCub(Cub cub) {
        cub.display();
    }

    Cub createCub(String name, int age) {
        return new Cub(name, age);
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Elephant elephant = new Elephant("Ganga", 25);

        Elephant.Cub cub1 = elephant.createCub("Moti", 2);
        Elephant.Cub cub2 = elephant.createCub("Raja", 3);

        elephant.showCub(cub1);
        System.out.println();

        elephant.showCub(cub2);
    }
}