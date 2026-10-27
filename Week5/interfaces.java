package Week5;

public class interfaces {

    public static void main(String[] args) {

        // Box bx = new Metal();
        // bx.heavy();

        // System.out.println(MathVal.radius);
        // System.out.println(MathVal.pi);

        C c = new C();
        c.fun();


    }
    
}

//Multiple inheritance --> Diamond Problem

// interface A{

//     void fun();

// }

// interface B{
//     void fun2();

// }

// class C implements A, B {
//     @Override 
//     public void fun(){

//     }

//     @Override 
//     public void fun2(){

//     }
// }






//Filling constants in interfaces
// interface MathVal{
//     double pi = 3.14;
//     int radius = 10;
// }


// interface Box{
//     void heavy();
// }
// class Metal implements Box{

//     @Override 
//    public void heavy(){  //public is necessary
//     System.out.println("Box is heavy");

//     }

// }

//Java Resolution Priority Rule --> class is prioritised over interface

interface A{
    default void fun(){
        System.out.println("A Interface");
    }

}

class B{
    public void fun(){
        System.out.println("B Class");
    }

}

class C extends B implements A{


}