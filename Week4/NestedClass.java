package Week4;

// A nested class is a class written inside another class.
class Elephant {
    private String motherName;
    private int motherAge;

    Elephant(String motherName, int motherAge) {
        this.motherName = motherName;
        this.motherAge = motherAge;
    }

    // Cub is an inner class. Each Cub belongs to one Elephant object.
    class Cub {
        private String cubName;
        private int cubAge;

        Cub(String cubName, int cubAge) {
            this.cubName = cubName;
            this.cubAge = cubAge;
        }

        void display() {
            // The inner class can use the outer class's fields.
            System.out.println("Mother: " + motherName);
            System.out.println("Mother's age: " + motherAge);
            System.out.println("Cub: " + cubName);
            System.out.println("Cub's age: " + cubAge);
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Elephant mother = new Elephant("Ganga", 25);

        // Make a Cub that belongs to this particular Elephant object.
        Elephant.Cub cub = mother.new Cub("Moti", 2);

        cub.display();
    }
}