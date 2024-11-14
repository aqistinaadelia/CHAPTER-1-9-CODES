
package task.pkg5;
import java.util.Scanner;
public class TASK5 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
     System.out.print("Enter the item name: ");
        String itemName = scanner.nextLine();

     System.out.print("Enter the price of the item: ");
        double price = scanner.nextDouble();
        
     System.out.print("Enter the quantity of the item: ");
        int quantity = scanner.nextInt();

     System.out.print("Enter the discount rate (as a percentage): ");
        double discountRate = scanner.nextDouble();
 
        double totalPrice = price * quantity;
        double discountAmount = totalPrice * (discountRate / 100);
        double priceAfterDiscount = totalPrice - discountAmount;

        System.out.println("\nItem Details:");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: RM" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: RM" + totalPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Price After Discount: RM" + priceAfterDiscount);

        scanner.close();
    }
}

    
    

