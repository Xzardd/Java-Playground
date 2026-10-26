public class RandomQuesP{

   public static void main(String[] args) {
      boy by = new boy(10, 28);
      by.display();

      

   
      
   }
}

class boy {
   int age;
   float weight;

   boy(int age, float weight){
      this.age = age;
      this.weight = weight;

   }

   void display(){
      System.out.println("Age" + age);
      System.out.println("Weight" + weight);

   }

}