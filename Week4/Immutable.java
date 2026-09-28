package Week4;

public class Immutable {
    public static void main(String[] args) {

        Number number = new Number(225);

        Cargo c = new Cargo("Evergreen", 45000, number);
       

System.out.println(c.getNum().num);
c.getNum().num = 224;

System.out.println(c.getNum().num);
        
    }
    
}


//Immutable class 
//do a defensive copy
final class Cargo{

    private final String name;
    private  final int weight;
    private final Number number;

    Cargo(String name, int weight, Number number){
        this.name = name ;
        this.weight = weight;
        this.number = new Number(number.num); //here

    }

    public String getName(){
        return  this.name;

    }

    public  int getWeight(){
        return this.weight;
    }

    public  Number getNum(){
        return new Number(this.number.num); //here
    }

}

//mutable
class Number{
    int num;

    Number(int num){
        this.num = num;

    }



}





