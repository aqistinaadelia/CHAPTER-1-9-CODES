
package maxminfinder;
import java.util.Scanner;
public class MaxMinFinder {

  public static void main(String[] args) {

        Scanner baca = new Scanner(System.in);
        int[] numbers = new int[3];
        int i = 0;

       
        while (i < 3) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = baca.nextInt();
            i++;
        }

        
        int max = getIntegerInput.findMax(numbers[0], numbers[1], numbers[2]);
        int min = getIntegerInput.findMin(numbers[0], numbers[1], numbers[2]);


        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

       
    }
}
 
   
