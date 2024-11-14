
package pkgif.demo;

import java.util.Scanner;

public class IfDemo {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter marks: ");
      int grade = scanner.nextInt();
      
      if (grade >= 60)
          System.out.println("Passed");
      
      else 
          System.out.println("Failed");
    }
    
}
