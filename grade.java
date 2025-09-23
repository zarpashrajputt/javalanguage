import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quiz = sc.nextInt();
        int ass = sc.nextInt();
        int mid = sc.nextInt();
        int fin = sc.nextInt();

        int total = quiz + ass + mid + fin;
        double avg = total;

        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);

        if (avg >= 85) System.out.println("A");
        else if (avg >= 70) System.out.println("B");
        else if (avg >= 50) System.out.println("C");
        else System.out.println("Fail");
    }
}
