public class PracticePPR {

    public static void main(String[] args) {

        // Ques 5
        // int a = 10;
        // int b = 40;
        // int c = 30;

        // if (a>b && a>c) {

        //     System.out.println("A");
            
        // } else if (b>a && b>c) {
        //     System.out.println("B");
            
        // } else { 
        //     System.out.println("C");
            
        // }

        //Ques6

        // int y = 1900;

        // if (y%400==0 || (y%4==0 && y%100 != 0)) {
        //     System.out.println("Its a leap year");
            
        // } else {
        //     System.out.println("Not a leap year");
            
        //}

        //Ques 7

        // int Cel = 5;

        // System.out.println((Cel * 9/5) + 32);

        //Ques 8 swapping

        // int a = 10;
        // int b = 20;
        
        // System.out.println("Before Swapping");
        // System.out.println(a);
        // System.out.println(b);

        // int temp = a;
        // a=b;
        // b=temp;

        // System.out.println("After Swapping");
        // System.out.println(a);
        // System.out.println(b);

        //Ques 9

        // int mulT = 5;

        // for(int k = 1; k<=10; k++){
        //     System.out.println( mulT + " x " + k + " = " + (mulT * k));
        // }

        //Ques 10

    //     int f = 8;
    //     int factorial = 1;

    //     for(int k = 1; k <=f; k++){
    //         factorial = factorial * k;
        
    //     }
    //    System.out.println(factorial); 

    //Ques 11

    // int d = 4321;
    // int count = 0;


    // while(d%10 != 0){
    //     d = d / 10;
    //     count++;
    // }

    // System.out.println(count);

    //Ques 12

    // int e = 87654;
    // int reverse = 0;

    // while( e !=0) {
    //     int dig = e % 10;
    //     reverse = reverse * 10 + dig;
    //     e = e / 10;
    // }
    // System.out.println(reverse);

    //Ques 13

    // int r = 121;
    // int rev = 0;
    // int original = r;

    // while(r !=0){

    //     int digi = r % 10;
    //     rev = rev * 10 + digi;
    //     r = r / 10;

    // }
    // System.out.println(rev);

    // if (original==rev) {
    //     System.out.println("It's Palindrome");
        
    // } else {
    //     System.out.println("Not a palindrome");
        
    // }

    //Ques 14

    // int sod = 248;
    // int sodsum = 0;

    // while (sod !=0) {
       
    //     int digit = sod % 10;
    //     sodsum = sodsum + digit;
    //     sod = sod / 10;
    // }
    // System.out.println(sodsum);

    //Ques 15

    // int pm = 15;
    // boolean isPrime = true;

    
    //     for(int i = 2; i<pm; i++){
    //      if(pm % i ==0){
    //         isPrime = false;
    //         break;

    //      }

    //      if (isPrime) {
    //         System.out.println("Prime");
    //      } else {
    //         System.out.println("Not Prime");
            
    //      }
    //     }
        
    //Ques 16

    int pp = 14;

    for(int pnum = 2; pnum<=pp; pnum++){
            boolean isPrime = true;

        
        
        for(int i = 2; i<pnum; i++){
        
            if (pnum%i==0) {
                isPrime = false;
                break;
            
                
            }

            


        }

         if (isPrime) {
            
        
                    System.out.println(pnum);
                
                }
       


    }









        
    }
    
}
