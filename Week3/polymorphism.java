package Week3;


class Payment {

    void pay(double amount) {
        System.out.println("Processing payment of ₹" + amount);
    }
}

class UPI extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CreditCard extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class Cash extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Payment payment;

        payment = new UPI();
        payment.pay(1500);

        payment = new CreditCard();
        payment.pay(2500);

        payment = new Cash();
        payment.pay(800);
    }
}