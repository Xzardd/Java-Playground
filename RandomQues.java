public class RandomQues {

    public static void main(String[] args) {

        StudentV[] students = {
            new StudentV(101, "Rahul", 78),
            new StudentV(102, "Aman", 91),
            new StudentV(103, "Riya", 84),
            new StudentV(104, "Karan", 67)
        };

        System.out.println("Student Details");

        for (StudentV student : students) {
            student.displayStudent();
            System.out.println();
        }

        StudentV highestStudent = students[0];

        for (StudentV student : students) {
            if (student.getMarks() > highestStudent.getMarks()) {
                highestStudent = student;
            }
        }

        System.out.println("Highest Marks");
        System.out.println(
            highestStudent.getName() + " - " + highestStudent.getMarks()
        );

        double totalMarks = 0;

        for (StudentV student : students) {
            totalMarks += student.getMarks();
        }

        double averageMarks = totalMarks / students.length;

        System.out.println("\nAverage Marks: " + averageMarks);

        System.out.println();
        StudentV.displayStudentCount();
    }
}


class StudentV {

    private int id;
    private String name;
    private double marks;

    private static int studentCount = 0;

    StudentV(int id, String name, double marks) {
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
    

