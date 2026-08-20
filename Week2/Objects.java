
class Student {

    String name;
    int age;
    String course;
    double marks;

    Student(String name, int age, String course, double marks) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    void study() {
        System.out.println(name + " is studying " + course);
    }

    void checkResult() {
        if (marks >= 40) {
            System.out.println(name + " has passed");
        } else {
            System.out.println(name + " has failed");
        }
    }

    void increaseMarks(double extraMarks) {
        marks = marks + extraMarks;
        System.out.println(name + "'s new marks: " + marks);
    }
}

public class Objects {
    public static void main(String[] args) {

        Student student1 = new Student("Rahul", 20, "Java", 78.5);
        Student student2 = new Student("Aman", 21, "Python", 65);
        Student student3 = new Student("Riya", 20, "Java", 88);

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        student1.study();
        student2.study();
        student3.study();

        System.out.println();

        student1.checkResult();
        student2.checkResult();
        student3.checkResult();

        System.out.println();

        student1.increaseMarks(5);
        student2.increaseMarks(10);
        student3.increaseMarks(2);

        System.out.println();

        Student student4 = new Student("Karan", 22, "C++", 35);

        student4.displayInfo();
        student4.study();
        student4.checkResult();
    }
}