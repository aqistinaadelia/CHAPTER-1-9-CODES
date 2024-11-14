
package purchasing.system;
import java.util.Scanner;
public class PurchasingSystem {
    
    
    public static void main(String[] args) {
        Scanner study = new Scanner(System.in);

        // Displaying the menu
        System.out.println("---- Welcome to Apple ----");
        System.out.println("Please select an item to purchase:");
        System.out.println("1. Iphone 7plus - RM 1000");
        System.out.println("2. Macbook - RM 5000");
        System.out.println("3. AppleTV - RM 3500");
        System.out.println("4. Exit");
        
        System.out.print("Enter the item number: ");
        int itemNumber = study.nextInt();
        
        System.out.print("Insert quantity : ");
        int quantity = study.nextInt();
        
        // declare the variables
        double price;
        double totalPrice=0;
      

        // Processing the order
        switch (itemNumber) {
            case 1:
                System.out.println("You have selected Iphone 7plus. The cost is RM 1000.");
                price= 1000; // cost per Iphone 
                totalPrice= price*quantity;
                System.out.println("Total Price: RM " + totalPrice);
                break;
            case 2:
                System.out.println("You have selected Macbook. The cost is RM 5000.");
                price= 5000; // cost per Macbook
                totalPrice= price*quantity;
                System.out.println("Total Price: RM " + totalPrice);
                break;
            case 3:
                System.out.println("You have selected AppleTV. The cost is RM 3500.");
                price= 3500; // cost per AppleTV
                totalPrice= price*quantity;
                System.out.println("Total Price: RM " + totalPrice);
                break;
            case 4:
                System.out.println("Exiting the system. Thank you for visiting!");
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
                break;        
                
        }

        
    }
}

