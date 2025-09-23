/*import java.util.Scanner;

public class pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String size = sc.next().toLowerCase();
        int bill = 0;

        switch (size) {
            case "small": bill = 100; break;
            case "medium": bill = 200; break;
            case "large": bill = 300; break;
            default: System.out.println("Wrong Size"); return;
        }

        if (sc.next().equalsIgnoreCase("yes"))
            bill += size.equals("small") ? 30 : 50;

        if (sc.next().equalsIgnoreCase("yes"))
            bill += 20;

        System.out.println("Bill = " + bill);
    }
}
*/