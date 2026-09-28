package Week4;

import java.io.*; // this * means import all io operations
import java.util.Scanner;

//Will learn in exception handling
public class IODeepDive {

    public static void main(String[] args) throws IOException {
        //will learn throws later 


//Reads only one byte
// int x = System.in.read();
// System.out.println((char)x);




//buffer Reader

//  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//     String name = br.readLine();

//     System.out.println(name);


//Scanner (modernly used)
Scanner sc = new Scanner(System.in);

String name = sc.nextLine();
int age = sc.nextInt();
double price = sc.nextDouble();


System.out.println(name);
System.out.println(age);
System.out.println(price);








    }

   

   




    
}
