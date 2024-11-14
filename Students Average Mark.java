
package task.pkg4;
import java.util.Scanner;
public class TASK4 {

   
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter student's name: ");
     String name = scanner.nextLine();
     
     System.out.print("Enter student's ID: ");
     String id = scanner.nextLine(); 
     
     System.out.print("Enter subject: ");
     String subject = scanner.nextLine();
     
     System.out.print("Enter marks for Test 1 (1/100): ");
     double test1Marks = scanner.nextDouble();
     
     System.out.print("Enter marks for Test 2 (1/100): ");
     double test2Marks = scanner.nextDouble();
     
     double averageMark = (test1Marks + test2Marks) / 2;
     
     System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject: " + subject);
        System.out.println("Average Mark: " + averageMark);

        scanner.close();
       }
    
}
