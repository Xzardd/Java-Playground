package Week4;

public class Boxing{

    public static void main(String[] args) {
        
    //     int x = 10;
    //     Integer y = x; //autoboxing

    //     System.out.println(x);
    //     System.out.println(y.intValue());  //unboxing



    //     Integer a = 20;
    //     int b = a;

    //     System.out.println(a.intValue());
    //     System.out.println(b);


    //     int i = 30;
    //     printValue(i);

    // }

    // static void printValue(Integer i){
    //     System.out.println(i);


    int v = 200;
    int u = 200;

    System.out.println(v==u);

    Integer m = 300; //two diff memory blocks are present 
    Integer n = 300;

    System.out.println(m.intValue() == n.intValue());


    Integer a = 45; //this method is used
    Integer b = 45;

    System.out.println(a.equals(b)); // if  equals b and point to same reference

    }


}