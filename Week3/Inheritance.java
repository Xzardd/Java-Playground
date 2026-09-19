package Week3;




class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Language: " + programmingLanguage);
    }

    void writeCode() {
        System.out.println(name + " is writing " + programmingLanguage + " code.");
    }
}

class SeniorDeveloper extends Developer {
    int experience;

    SeniorDeveloper(String name, double salary, String programmingLanguage, int experience) {
        super(name, salary, programmingLanguage);
        this.experience = experience;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Experience: " + experience + " years");
    }

    void mentor() {
        System.out.println(name + " is mentoring junior developers.");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        SeniorDeveloper dev = new SeniorDeveloper(
            "Rahul",
            85000,
            "Java",
            5
        );

        dev.showDetails();
        dev.writeCode();
        dev.mentor();
    }
}
