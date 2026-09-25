public class Main {

    public static void main(String[] args) {

        Student[] students = {
            new Student(101, "Rahul", 78),
            new Student(102, "Aman", 91),
            new Student(103, "Riya", 84),
            new Student(104, "Karan", 67)
        };

        System.out.println("----- Student Details -----");

        for (Student student : students) {
            student.displayStudent();
            System.out.println();
        }

        Student highestStudent = students[0];

        for (Student student : students) {
            if (student.getMarks() > highestStudent.getMarks()) {
                highestStudent = student;
            }
        }

        System.out.println("----- Highest Marks -----");
        System.out.println(
            highestStudent.getName() + " - " + highestStudent.getMarks()
        );

        double totalMarks = 0;

        for (Student student : students) {
            totalMarks += student.getMarks();
        }

        double averageMarks = totalMarks / students.length;

        System.out.println("\nAverage Marks: " + averageMarks);

        System.out.println();
        Student.displayStudentCount();
    }
}


class Student {

    private int id;
    private String name;
    private double marks;

    private static int studentCount = 0;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;

        studentCount++;
    }

    public char calculateGrade() {

        if (marks >= 90) {
            return 'A';
        }
        else if (marks >= 80) {
            return 'B';
        }
        else if (marks >= 70) {
            return 'C';
        }
        else if (marks >= 60) {
            return 'D';
        }
        else {
            return 'F';
        }
    }

    public void displayStudent() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    
    public double getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public static void displayStudentCount() {
        System.out.println("Total Students: " + studentCount);
    }
}
    

