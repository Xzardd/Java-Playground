package Week5;

public class Strings {
//Sequence of characters
//can also be called as character array
//non primitive data type
//type of Immutable class
   public static void main(String[] args) {

      // String s1 = "Hi";  //literal way
      // String s2 = "Hi";
      // System.out.println(s1 == s2); // true

      // String s3 = new String("Farhan");
      // String s4 = new String("Farhan");

      // System.out.println(s3 == s4); //false

      //Problem of Immutability
      String s = "";

      for(int i=0; i<5; i++){
         s+=i;
         System.out.println(s);



      }




   }



}
