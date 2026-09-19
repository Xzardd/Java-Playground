package Week3;

public class Oops {

    public static void main(String[] args) {

        StudentX s1 = new StudentX("Farhan", 23, 102, "Patna");

        s1.markAttendance();
        s1.print();
    }
}

class StudentX {

    String name;
    int age;
    int rolNum;
    String city;

    StudentX(String name, int age, int rolNum, String city) {
        this.name = name;
        this.age = age;
        this.rolNum = rolNum;
        this.city = city;
    }

    void markAttendance() {
        System.out.println("This attendance is marked by " + name);
    }

    void print() {
        System.out.println(name + " " + age + " " + rolNum + " " + city);
    }
}