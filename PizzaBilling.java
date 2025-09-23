/* import java.util.Scanner;

public class PizzaBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String size;
        int basePrice = 0;

        while (true) {
            System.out.print("Enter pizza size (small, medium, large): ");
            size = sc.next().toLowerCase();

            if (size.equals("small")) {
                basePrice = 100;
                break;
            } else if (size.equals("medium")) {
                basePrice = 200;
                break;
            } else if (size.equals("large")) {
                basePrice = 300;
                break;
            } else {
                System.out.println("Invalid! Try again.");
                continue;
            }
        }

        int bill = basePrice;

        // pepperoni
        System.out.print("Do you want pepperoni? (yes/no): ");
        String pepper = sc.next().toLowerCase();
        if (pepper.equals("yes")) {
            if (size.equals("small")) bill += 30;
            else bill += 50; // medium or large
        }

        // extra cheese
        System.out.print("Do you want extra cheese? (yes/no): ");
        String cheese = sc.next().toLowerCase();
        if (cheese.equals("yes")) bill += 20;

        System.out.println();
        System.out.println("Your final bill is: " + bill + " rupees");

        sc.close();
    }
} /* 