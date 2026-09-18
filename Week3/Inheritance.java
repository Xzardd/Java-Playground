package Week3;


class Employee {

    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void code() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }

    @Override
    void work() {
        System.out.println(name + " is developing software");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Developer d = new Developer("Wiz", 60000, "Java");

        d.showDetails();
        d.work();
        d.code();
    }
}

