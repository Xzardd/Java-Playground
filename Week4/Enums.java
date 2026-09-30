package Week4;

//Enumerations 
public class Enums {
    
    public static void main(String[] args) {

        PaymentStatus status = PaymentStatus.SUCCESS;
        System.out.println(status.name());


    }
}

    enum PaymentStatus{

        SUCCESS,
        FAILED,
        PENDING;

    }

    class PaymentStatus2{

        public static final int SUCCESS = 1;
        public static final int FAILED = 2;
        public static final int PENDING = 3;

    }
        
  