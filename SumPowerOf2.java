
package sumpowerof2;
public class SumPowerOf2 {

    public static void main(String[] args) {
      
      
        int mula = 1;
        int akhir = 10;

       
        int sum = 0;

       
        System.out.println("Power of two for integers from 1 to 10:");
        for (int i = mula; i <= akhir; i++) {
            int powerOfTwo = (int) Math.pow(i, 2);  
            System.out.println(i + "^2" + " = " + powerOfTwo);
            sum += powerOfTwo;  
        }

        
        System.out.println("\nSum of powers of two from 1^2 to 10^2: " + sum);
    }
}



