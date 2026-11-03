package Week5;

public class Diff_String {

    //Different String Methods, String Buffer And Builder
    public static void main(String[] args) {
        
        char[] arr = {'a', 'b', 'c', 'd'};
        String s5 =new String(arr,0,3);
        // System.out.println(s5);

        String s1 = new String("abc");
        String s2 = new String("abe");

        // System.out.println(s1.compareTo(s2));

        // System.out.println(s1.contains("a"));


        //Spliting 
        String s3 = new String("Raj-Farhan-Fahad");
        String[] array = s3.split("-");

        for(String s : array) {
            System.out.println(s);

        }
        //Joining
        System.out.println(String.join("-", "a", "b", "c"));

 





    }
}
