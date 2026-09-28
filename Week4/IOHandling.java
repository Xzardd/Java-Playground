package Week4;

import java.io.*;

//Will learn in exception handling
public class IOHandling {

    public static void main(String[] args) throws IOException {
        


//Reads only one byte
// int x = System.in.read();
// System.out.println((char)x);




//buffer Reader

 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String name = br.readLine();

    System.out.println(name);

    }

   

   




    
}
