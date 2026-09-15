package Questions;

public class Type2 {

    //Fibonacci

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide N as an argument ");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        long first = 0, second = 1;

        System.out.print("First " + n + " Fibonacci numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    
}
