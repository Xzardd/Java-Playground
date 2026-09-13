package Week3;

public class Function {


//no ip no op
static void greet(){
    System.out.println("Hi");
}

// ip no op
static void sayHi(String name) {
    System.out.println("Hello " + name);
}

// no ip but op

static int getNum(){
    return 10;
}

// ip op

static int multiply(int a, int b){
    return (a * b);
}

    public static void main(String[] args) {

        //calling each function

        greet();

        sayHi("Farhan");
          
        int x = getNum();
        System.out.println(x);
        // System.out.println(getNum()); this can also be used
       
        System.out.println(multiply(3, 6));
       
    }
    
}
