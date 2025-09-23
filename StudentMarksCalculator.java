/*import java.util.Scanner;

public class StudentMarksCalculator {
    static int total;  

    public static void totalMarks(int m1, int m2, int m3) {
        total = m1 + m2 + m3;
        System.out.println("Total Marks = " + total);
    }

    public static double averageMarks() {
        double avg = total / 3.0;
        return avg;
    }

    public static char grade(double avg) {
        if (avg >= 85) {
            return 'A';
        } else if (avg >= 70) {
            return 'B';
        } else if (avg >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int m3 = sc.nextInt();

        totalMarks(m1, m2, m3);
        double avg = averageMarks();
        System.out.println("Average Marks = " + avg);
        char g = grade(avg);
        System.out.println("Grade = " + g);

        sc.close();
    }
}
*/
