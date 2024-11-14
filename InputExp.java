package inputexp;
import java.util.Scanner;
public class InputExp {

  
    public static void main(String[] args) {
       
        String name;
        int age;
        Scanner store = new Scanner(System.in);
        
        // Reads a single line from the console
        // and stores into name variable
        name = store.nextLine();
        
        // Reads a integer from the console
        // and stores into name variable
        age=store.nextInt();
        System.out.println("Enter username");
        System.out.println("Enter age");
        store.close();
        
        // Prints name and age to the console 
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        
        
    }
    
}
