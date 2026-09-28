package Week4;

import java.io.IOException;

//Will learn in exception handling
public class IOHandling {

    public static void main(String[] args) throws IOException {
        


//Reads only one byte
int x = System.in.read();

System.out.println((char)x);

    }


    
}
