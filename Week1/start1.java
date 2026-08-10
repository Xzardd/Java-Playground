public class start1 {

public static void main(String[] args){

int a = 45;
int b = 15;
int decimal = 10;
int binary = 0b1010;
int octal = 012;
int hexa = 0xA;

System.out.println("before swap " );
System.out.println("a = " +a);
System.out.println("b = " +b);

int temp = a;
a=b;
b=temp;

System.out.println("after swapping ");
System.out.println("a = " +a);
System.out.println("b = " +b);



System.out.println(decimal);
System.out.println(binary);
System.out.println(octal);
System.out.println(hexa);




}

}