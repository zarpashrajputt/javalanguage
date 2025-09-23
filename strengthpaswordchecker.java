import java.util.Scanner;

public class strengthpaswordchecker {

    public static void checkPassword(String password) {
        int len = password.length();

        if (len < 6) {
            System.out.println("Too Short");
            return;
        }

        boolean letter = false;
        boolean digit = false;
        boolean special = false;

        String s = "!@#$%^&*";

        for (int i = 0; i < len; i++) {
            char ch = password.charAt(i);

            if (Character.isLetter(ch)) {
                letter = true;
            } else if (Character.isDigit(ch)) {
                digit = true;
            } else if (s.indexOf(ch) != -1) {
                special = true;
            }
        }

        if (len >= 6 && len <= 10) {
            if ((letter && !digit) || (!letter && digit)) {
                System.out.println("Weak");
            } else if (letter && digit) {
                System.out.println("Medium");
            }
        } else if (len > 10) {
            if (letter && digit && special) {
                System.out.println("Strong");
            } else {
                System.out.println("Medium");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        checkPassword(pass);
    }
}

