class Student {
    String name;
    int age;

    void introduce() {
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
    }
}

public class Objects {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Rahul";
        s1.age = 20;

        s1.introduce();
    }
}
