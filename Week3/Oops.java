package Week3;

public class Oops { 
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Farhan";
        s1.age = 23;
        s1.rollNum = 19;
        s1.city = "Patna";

        s2.name = "Rehan";
        s2.age = 20;
        s2.rollNum = 20;
        s2.city = "Same Patna";

        s1.markAttendance();
        s1.print();

        s2.markAttendance();
        s2.print();

        


        
    }
    
}

class Student{
String name;
int age;
int rollNum;
String city;

void markAttendance(){
    System.out.println("Attendance marked by : " +name);

}

void print(){
    System.out.println(name+ " " + age + " " +rollNum+ " " + city );

}

}
