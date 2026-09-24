package Week4;

public class Boxing{

    public static void main(String[] args) {
        
        int x = 10;
        Integer y = x; //autoboxing

        System.out.println(x);
        System.out.println(y.intValue());  //unboxing



        Integer a = 20;
        int b = a;

        System.out.println(a.intValue());
        System.out.println(b);


        int i = 30;
        printValue(i);

    }

    static void printValue(Integer i){
        System.out.println(i);

    }


}