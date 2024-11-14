
package student.average;
import java.util.Scanner;
public class StudentAverage {


   public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        // Input for first student
        System.out.println("Enter marks for Student 1 (3 subjects):");
        double m1_1 = baca.nextDouble();
        double m1_2 = baca.nextDouble();
        double m1_3 = baca.nextDouble();

        // Input for second student
        System.out.println("Enter marks for Student 2 (3 subjects):");
        double m2_1 = baca.nextDouble();
        double m2_2 = baca.nextDouble();
        double m2_3 = baca.nextDouble();

        // Input for third student
        System.out.println("Enter marks for Student 3 (3 subjects):");
        double m3_1 = baca.nextDouble();
        double m3_2 = baca.nextDouble();
        double m3_3 = baca.nextDouble();

        // Calculate averages for each student
        double avg1 = (m1_1 + m1_2 + m1_3) / 3;
        double avg2 = (m2_1 + m2_2 + m2_3) / 3;
        double avg3 = (m3_1 + m3_2 + m3_3) / 3;

        // Display the averages
        System.out.println("\nAverage marks of Student 1: " + avg1);
        System.out.println("Average marks of Student 2: " + avg2);
        System.out.println("Average marks of Student 3: " + avg3);

        // Find the highest average using Math.max()
        double highestAverage = Math.max(avg1, Math.max(avg2, avg3));
        System.out.println("\nThe highest average is: " + highestAverage);
    }
}