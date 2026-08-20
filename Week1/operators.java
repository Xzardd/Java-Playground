public class operators {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int postResult = a++ * 2;
        int preResult = ++b * 2;

        System.out.println("postResult: " + postResult + ", a: " + a);
        System.out.println("preResult: " + preResult + ", b: " + b);

       

        int number = 8;
        int leftShift = number << 2;
        int rightShift = number >> 1;

        System.out.println("leftShift: " + leftShift);
        System.out.println("rightShift: " + rightShift);

        int READ = 1;
        int WRITE = 2;
        int permissions = READ | WRITE;
        boolean canWrite = (permissions & WRITE) != 0;

        System.out.println("canWrite: " + canWrite);

        int x = 10;
        int y = 25;
        x ^= y;
        y ^= x;
        x ^= y;

        System.out.println("x: " + x + ", y: " + y);

        int score = 85;
        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : 'F';

        System.out.println("grade: " + grade);

        byte byteVal = 100;
        byteVal += 5;

        System.out.println("byteVal: " + byteVal);

        Object obj = "Hello Java";
        if (obj instanceof String s && s.length() > 5) {
            System.out.println("upper: " + s.toUpperCase());
        }
    }
}