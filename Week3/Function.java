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

static int sum(int a, int b){
    return (a+b);

}

static int sum(int a, int b, int c){
    return (a+b+c);
}

static void meet(String name, int age){
    System.out.println("hello "+name + "your age is " +age);
}

static void meet(int age, String name) {
    System.out.println("Your age is "+age+ "Your are " + name);
}

//Functon Overloading (sam name diff parameter)


    public static void main(String[] args) {

        //calling each function

        greet();

        sayHi("Farhan");
          
        int x = getNum();
        System.out.println(x);
        // System.out.println(getNum()); this can also be used
       
        System.out.println(multiply(3, 6));

        int z = sum(2, 4);
        System.out.println(z);

        int r = sum(2, 4, 6);
        System.out.println(r);

        meet("Farhan", 23);

        meet(23, "Farhan");
       
    }
    
}
