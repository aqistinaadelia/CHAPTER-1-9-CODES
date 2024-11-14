
package task.pkg2;
import java.util.Scanner;
public class TASK2 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
    System.out.print("Enter your name: ");  
     String name = scanner.nextLine();
     
    System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        
    System.out.print("Enter your hobby: ");
        String hobby = scanner.nextLine();
        
    System.out.print("Enter your favorite food: ");
        String favoriteFood = scanner.nextLine(); 
        
     System.out.println("\nUser Information:");
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Hobby: " + hobby);
     System.out.println("Favorite Food: " + favoriteFood);  
    }
    
}
