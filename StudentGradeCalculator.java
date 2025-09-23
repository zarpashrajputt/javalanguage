/*import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User se marrks liye
        System.out.print("Enter Quiz Marks (out of 15): ");
        int quiz = sc.nextInt();

        System.out.print("Enter Assignment Marks (out of 10): ");
        int assign = sc.nextInt();

        System.out.print("Enter Mid-Term Marks (out of 25): ");
        int mid = sc.nextInt();

        System.out.print("Enter Final Marks (out of 50): ");
        int fin = sc.nextInt();

        // Total aur average nikala
        int total = quiz + assign + mid + fin;
        double average = (double) total; 
        char gradeLetter;
        String gradeDetail;
        if (total >= 85) {
            gradeLetter = 'A';
            gradeDetail = "A";
        } else if (total >= 80) {
            gradeLetter = 'A';
            gradeDetail = "A-";
        } else if (total >= 70) {
            gradeLetter = 'B';
            gradeDetail = "B";
        } else if (total >= 60) {
            gradeLetter = 'C';
            gradeDetail = "C";
        } else {
            gradeLetter = 'F';
            gradeDetail = "F";
        }

        // Output
        System.out.println();
        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);
        System.out.println("Grade = " + gradeDetail);

        sc.close();
    }
}*/
