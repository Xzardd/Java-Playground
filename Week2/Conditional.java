public class Conditional {

    public static void main(String[] args) {
        
    int x = 12;
    int y = 29;
    int z = 45;

    //simple if else block

   if (x>y && y>z) {
    System.out.println("1st choice");
    
   }

   else if (z<y) {
    System.out.println("2nd choice");
    
   }

   else{

    System.out.println("3rd choice");

   }


// ?: ternary operator, not suitable for every case but can be used sometimes

int a = 4;
int result = 0;

result = a%2==0 ? 10:20; 
System.out.println(result);


//switch case

int it = 7;

switch (it) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("not valid");
        break;
}


    }
    
}
