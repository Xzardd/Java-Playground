package Week3;

public class practice3 {
    public static void main(String[] args) {
        Child s1 = new Child("Farhan", 23, 223, "Patna");

        s1.showYourself();
        s1.shown();
        
    }
    
}

class Child {

    String name;
    int age;
    int rollNum;
    String city;

    Child(String name, int age, int rollNum, String city){
~
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.city = city;

    }

    void showYourself(){
        System.out.println("Done by " +name);
    }

    void shown(){

        System.out.println(name +" "+ age +" " +rollNum+" "+city);
    }
}
