/*import java.util.Scanner;

public class StudentMarksFunctions {
    public static int totalMarks(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }
    public static double averageMarks(int m1, int m2, int m3) {
        return totalMarks(m1, m2, m3) / 3.0;
    }
    public static char grade(double avg) {
        if (avg >= 80) return 'A';
        else if (avg >= 70) return 'B';
        else if (avg >= 60) return 'C';
        else return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter mark 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter mark 3: ");
        int m3 = sc.nextInt();

        int total = totalMarks(m1, m2, m3);
        double avg = averageMarks(m1, m2, m3);
        char gr = grade(avg);

        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);
        System.out.println("Grade = " + gr);

        sc.close();
    }
}*/
