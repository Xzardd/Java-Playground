package Week5;

public class Buffer_Builder {

    public static void main(String[] args) {
        
    StringBuilder sb = new StringBuilder();

    sb.append("Farhu");
    // sb.append("Badaboom");
    // System.out.println(sb);


    // sb.insert(2, "v"); //favrhu
    // System.out.println(sb);

    // sb.replace(1, 4, "NOW");
    // System.out.println(sb);

    // System.out.println(sb.capacity());

    sb.ensureCapacity(100);
    System.out.println(sb.capacity());



    }
    
}
