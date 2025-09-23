/*import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 1234;       // pin ko define krliya 
        int balance = 0;      // starting balance
        boolean loggedIn = false;

        // 3 attempts for PIN
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == pin) {
                loggedIn = true;
                System.out.println("Login Successful!");
                break;   // exit loop if correct
            } else {
                System.out.println("Wrong PIN. Attempts left: " + (3 - i));
            }
        }

        if (!loggedIn) {
            System.out.println("Account Locked. Too many wrong attempts.");
            return;   // program end
        }

        // Menu after login
        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                int amount = sc.nextInt();
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposit successful. Balance: " + balance);
                } else {
                    System.out.println("Invalid amount!");
                }

            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                int amount = sc.nextInt();
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawal successful. Balance: " + balance);
                } else {
                    System.out.println("Invalid amount or not enough balance!");
                }

            } else if (choice == 3) {
                System.out.println("Your balance is: " + balance);

            } else if (choice == 4) {
                System.out.println("Thank you for using ATM.");
                break;   // exit while loop

            } else {
                System.out.println("Invalid option. Try again.");
                continue;   // back to menu
            }
        }

        sc.close();
    }
}
*/
    

