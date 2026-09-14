package Week3;

public class Oops {
    
    public static void main(String[] args) {

        Student s1 = new Student("Farhan",23,102,"Patna");

      
        s1.markAttendance();
        s1.print();
        
    }
}

class Student {

String name;
int age;
int rolNum;
String city;

Student(String name, int age, int rolNum, String city){

    this.name = name;
    this.age = age;
    this.rolNum = rolNum;
    this.city = city;

}

void markAttendance(){
    System.out.println("This attendance is marked by " +name);

}

void print(){
    System.out.println(name + " " + age + " " + rolNum + " " + city);

}

}