
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000.00;
        double dailyWithdrawalLimit = 5000.00;
        double totalWithdrawn = 0.00;
        int transactionCount = 0;

        int correctPIN = 1234;
        int attempts = 0;
        boolean authenticated = false;

        // PIN Verification
        while (attempts < 3) {
            System.out.print("Enter your 4-digit PIN: ");
            int enteredPIN = sc.nextInt();

            if (enteredPIN == correctPIN) {
                authenticated = true;
                System.out.println("\nPIN verified successfully!");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN!");

                if (attempts < 3) {
                    System.out.println(
                        "Attempts remaining: " + (3 - attempts)
                    );
                }
            }
        }

        if (!authenticated) {
            System.out.println("Too many incorrect attempts.");
            System.out.println("Your account is locked.");
            sc.close();
            return;
        }

        int choice;

        // ATM Menu
        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction Count");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.printf(
                        "Available Balance: Rs. %.2f%n", balance
                    );
                    break;

                case 2:
                    System.out.print("Enter deposit amount: Rs. ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        transactionCount++;

                        System.out.println("Deposit successful!");
                        System.out.printf(
                            "New Balance: Rs. %.2f%n", balance
                        );
                    } else {
                        System.out.println(
                            "Invalid amount! Deposit must be positive."
                        );
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: Rs. ");
                    double withdrawal = sc.nextDouble();

                    if (withdrawal <= 0) {
                        System.out.println(
                            "Invalid amount! Enter a positive amount."
                        );
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient balance!");
                    } else if (
                        withdrawal > dailyWithdrawalLimit - totalWithdrawn
                    ) {
                        System.out.println(
                            "Daily withdrawal limit exceeded!"
                        );
                        System.out.printf(
                            "Remaining daily limit: Rs. %.2f%n",
                            dailyWithdrawalLimit - totalWithdrawn
                        );
                    } else {
                        balance -= withdrawal;
                        totalWithdrawn += withdrawal;
                        transactionCount++;

                        System.out.println("Please collect your cash.");
                        System.out.printf(
                            "Remaining Balance: Rs. %.2f%n", balance
                        );
                    }
                    break;

                case 4:
                    System.out.println(
                        "Total successful transactions: "
                        + transactionCount
                    );
                    break;

                case 5:
                    System.out.println("Thank you for using our ATM!");
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Please select 1 to 5."
                    );
            }

        } while (choice != 5);

        sc.close();
    }
}
