
package passsystem;
import java.util.Scanner;
public class PassSystem {

  
    public static void main(String[] args) {
        
        final String correctPassword = "AinaAB456";
        
        final int maxAttempts = 3;
        
        int attempts = 0;
        
        
        Scanner scanner = new Scanner(System.in);
        
      
        while (attempts < maxAttempts) {
            System.out.print("Enter your password: ");
            String userInput = scanner.nextLine();

           
            if (userInput.equals(correctPassword)) {
                System.out.println("Access granted. Welcome!");
                break; 
            } else {
                attempts++;
                System.out.println("Incorrect password. You have " + (maxAttempts - attempts) + " attempt(s) left.");
            }

            
            if (attempts == maxAttempts) {
                System.out.println("Maximum attempts reached. Access denied.");
            }
        }
    }
}

   