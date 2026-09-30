package Week4;
import java.util.Scanner;

//Enumerations 
public class Enums{

public static void main(String[] args) {



    DIRECTION direction = DIRECTION.NORTH;
    direction.move(); 
    
}
}

enum DIRECTION{

    

    NORTH{
        @Override 
        public void move(){
            

        }
    },
    SOUTH{
         @Override 
        public void move(){
            System.out.println("South direction");
        }

    },
    EAST{
         @Override 
        public void move(){
            System.out.println("East direction");
        }

    },
    WEST{
         @Override 
        public void move(){
            System.out.println("West direction");
        }

    };

    public abstract void move();
}