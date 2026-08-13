class Student {

    String name;
    int age;
    int marks;

    // Constructor
    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    // Method that works with object data
    void checkResult() {
        if (marks >= 40) {
            System.out.println(name + " has passed.");
        } else {
            System.out.println(name + " has failed.");
        }
    }
}

public class Objects {
    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student("Rahul", 20, 85);
        Student s2 = new Student("Aman", 21, 35);

        // Calling methods using objects
        s1.displayDetails();
        s1.checkResult();

        System.out.println();

        s2.displayDetails();
        s2.checkResult();
    }
}