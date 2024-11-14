
package salescommission;  
import java.util.Scanner;
public class SalesCommission {

 
    private static final double WEEKLY_SALARY = 600.0;
    private static final double COMMISSION_RATE = 0.05; 

    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        
        System.out.print("Enter the total sales for the previous week (in RM): ");
        double totalSales = baca.nextDouble();

       
        if (totalSales < 0) {
            System.out.println("Total sales cannot be negative. Exiting.");
            baca.close();
            return;
        }

       
        double commission = totalSales * COMMISSION_RATE;
        double totalEarnings = WEEKLY_SALARY + commission;

  
       System.out.println("Salesman's earnings for the week:\n");
       System.out.println("Weekly Salary: RM" + String.format("%.2f", WEEKLY_SALARY));
       System.out.println("Commission (5% of sales): RM" + String.format("%.2f", commission));
       System.out.println("Total Earnings: RM" + String.format("%.2f", totalEarnings));


    }
    
}
