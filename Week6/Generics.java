package Week6;

public class Generics {
    

    public static void main(String[] args) {

        //Upcasting
        // String s = "Hello";
        // Object obj = s;
        // System.out.println(obj);

        //Downcasting
        // Object obj2 = "hola";
        // String s2 = (String)obj2;
        // System.out.println(s2);
        
         //Class Cast Exception
        // Object obj3 = 10;
        // String s3 =(String)obj3; 
        // System.out.println(s3);

  Box<Integer> bx = new Box<>(10);
  Box<String> bx1 = new Box<>("shakku");


  System.out.println(bx.getValue());
  System.out.println(bx1.getValue());

        



    }
}

//Generics
class Box<T>{ //type parameter

    private T value;

    Box(T value){
        this.value = value;

    }

    public T getValue(){
        return this.value;
    }

    public void setValue(T value){
        this.value = value;
    }

}

