
package task.pkg3;
import java.util.Scanner;
public class TASK3 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
    System.out.print("Enter Year: "); 
    int Year = scanner.nextInt();

    System.out.print("Birth Year: ");  
    int BirthYear = scanner.nextInt();
    
    int age = Year - BirthYear;
    
    System.out.println("Your age is:" + age + " years old.");
    
    scanner.close();
    
    
    }
    
}
