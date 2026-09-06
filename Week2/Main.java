class Student {
    private String name;
    private int rollNo;
    private double marks;

    // Constructor
    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to calculate grade
    void calculateGrade() {
        if (marks >= 90)
            System.out.println(name + " → Grade A");
        else if (marks >= 75)
            System.out.println(name + " → Grade B");
        else if (marks >= 60)
            System.out.println(name + " → Grade C");
        else
            System.out.println(name + " → Grade D");
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student("Rahul", 101, 87);
        Student s2 = new Student("Aman", 102, 92);

        s1.display();
        s1.calculateGrade();

        System.out.println();

        s2.display();
        s2.calculateGrade();
    }
}