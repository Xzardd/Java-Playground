class Student {
    String name;
    int age;
    String branch;
    double cgpa;

    Student(String name, int age, String branch, double cgpa) {
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.cgpa = cgpa;
    }
}

public class Objects {
    public static void main(String[] args) {
        Student student1 = new Student("Farhan", 23, "Computer Science", 7.8);

        System.out.println(student1.name);
        System.out.println(student1.branch);
        System.out.println(student1.cgpa);
    }
}
