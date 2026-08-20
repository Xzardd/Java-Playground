public class practice {
    public static void main(String[] args) {
     
   int n = 20;

     for(int num = 2; num<=n;num++ ){

        boolean isprime = true;

        for(int a = 2; a<num; a++){

            if (num % a == 0 ) {
                isprime = false;
                break;
                
            }

        }

        if (isprime) {
            System.out.println(num);
        }

     }

   }
 
    

}

    
        



        
    



    

