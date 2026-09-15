package Questions;

public class Type2 {

    //Fibonacci

   public static void main(String[] args) {
        if (System.console() == null) {
            System.out.println("No console available. Run this program from a terminal.");
            return;
        }

        System.out.print("Enter N for Fibonacci Series: ");
        int n = Integer.parseInt(System.console().readLine().trim());

        if (n <= 0) {
            System.out.println("Please enter a positive integer for Fibonacci.");
        } else {
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


        System.out.print("Enter a number to check Armstrong: ");
        int num = Integer.parseInt(System.console().readLine().trim());

        if (num < 0) {
            System.out.println(num + " is not an Armstrong number.");
        } else {
            int temp = num;
            int digits = (temp == 0) ? 1 : 0;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            long sum = 0;
            temp = num;
            while (temp > 0) {
                int digit = temp % 10;

                long power = 1;
                for (int i = 0; i < digits; i++) {
                    power *= digit;
                }
                sum += power;

                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }
        }
    }
    
}
