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

    int e = 87654;
    int reverse = 0;

    while( e !=0) {
        int dig = e % 10;
        reverse = reverse * 10 + dig;
        e = e / 10;
    }
    System.out.println(reverse);




        
    }
    
}
