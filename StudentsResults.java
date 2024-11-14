
package studentsresults;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class StudentsResults {

   
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

       int numStudents = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of students:"));
        
       
        if (numStudents <= 0) {
            System.out.println("Invalid number of students. Exiting.");
            baca.close();
            return;
        }
       int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;
       int passedKira = 0;
       int failedKira = 0;

       System.out.println("Enter the marks for each student (0 - 100):");
       for (int i = 1; i <= numStudents; i++) {
       System.out.print("Student " + i + ": ");
       int mark = baca.nextInt();
       
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
       
    System.out.println("\nStudent's Grade:");
    System.out.println("Number of students with Grade A: " + gradeA);
    System.out.println("Number of students with Grade B: " + gradeB);
    System.out.println("Number of students with Grade C: " + gradeC);
    System.out.println("Number of students with Grade D: " + gradeD);
    System.out.println("Number of students with Grade F: " + gradeF);
    
    System.out.println("\nTotal Passed: " + passedKira);
    System.out.println("Total Failed: " + failedKira);
            
           
     
         if (passedKira > failedKira) {
        System.out.println("Bonus to instructor!");
    }    else {
        System.out.println("LOL No Bonus.");
        
    }
        System.out.println("Exit");
            
        }
 
    }

   
