
package gradingsystem;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class GradingSystem {

   
   public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        String continueProgram;
       
       // Use JOptionPane to get the number of students
       do{
       int numStudents = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of students:"));
        
        // Validation for the number of students
        if (numStudents <= 0) {
            System.out.println("Invalid number of students. Exiting.");
            baca.close();
            return;
        }
       
       // Variables to store grade counts 
       int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;
       int passedKira = 0;
       int failedKira = 0;
       
       // Use Scanner for entering each student's marks
       System.out.println("Enter the marks for each student (0 - 100):");
       for (int i = 1; i <= numStudents; i++) {
       System.out.print("Student " + i + ": ");
       int mark = baca.nextInt();
       
         // Determine grade based on the entered mark
         if (mark >= 90) {
            gradeA++;
            passedKira++;
        } else if (mark >= 80) {
            gradeB++;
            passedKira++;
        } else if (mark >= 70) {
            gradeC++;
            passedKira++;
        } else if (mark >= 60) {
            gradeD++;
            passedKira++;
        } else {
            gradeF++;
            failedKira++;
        }
    }
       
    // Display Student's Grade using System.out   
    System.out.println("\nStudent's Grade:");
    System.out.println("Number of students with Grade A: " + gradeA);
    System.out.println("Number of students with Grade B: " + gradeB);
    System.out.println("Number of students with Grade C: " + gradeC);
    System.out.println("Number of students with Grade D: " + gradeD);
    System.out.println("Number of students with Grade F: " + gradeF);
    
    //Display Total Passed and Total Failed students
    System.out.println("\nTotal Passed: " + passedKira);
    System.out.println("Total Failed: " + failedKira);
            
           
     //Validate if instructor gets a bonus or not 
         if (passedKira > failedKira) {
        System.out.println("\nBonus to instructor!");
    }    else {
        System.out.println("\nLOL No Bonus.");
        
    }    
         // Ask the user if they want to continue assess
         System.out.println("\nWould you like to assess another students? (yes/no): ");
         continueProgram = baca.next();

        } while (continueProgram.equalsIgnoreCase("yes"));
       JOptionPane.showMessageDialog(null, "Exiting the program. Thank you!");
            
        }
 
    }

   