package Week3;

public class Encapsulation {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.deposit(500);
        ba.withdraw(200);

        System.out.println(ba.getBalance());

        
        

        

    }
    
}

class BankAccount{

    private double balance;

    public void deposit(int amount){
        balance += amount;

    }

    public  void withdraw(int amount){
        balance -= amount;
    }

    public double getBalance(){
        return balance;

    }

}

class Student1{
    String name;
    int Age;
    int rollNum;

Student1(String name , int age , int rollNum){
    this.name = name;
    this.Age = age;
    this.rollNum = rollNum;
}

public String getName(){
    return name;
}

public void setName(String name){
    this.name = name;
}

}
