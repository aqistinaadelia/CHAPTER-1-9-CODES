
package task.pkg6;

import java.util.Scanner;

public class TASK6 {

    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        try {
            System.out.print("Enter weight (kg): ");
            double weight = baca.nextDouble();

            System.out.print("Enter height (m): ");
            double height = baca.nextDouble();

            double bmi = weight / (height * height);
            System.out.print("\nBody Mass Index (BMI): " + bmi);
        } catch (Exception e) {
            System.out.println("Please enter number");
        }

    }
}
