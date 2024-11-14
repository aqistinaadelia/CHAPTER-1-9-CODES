import javax.swing.*;


public class PaymentOptions {

    private static String paymentOption = "Cash";

    public void paymentFunction() {
        String[] options = {"Cash", "Credit Card", "PayPal"};
        int choice = JOptionPane.showOptionDialog(null, "Select payment option:", "Payment Option",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (choice == 0) {
            paymentOption = "Cash";
        } else if (choice == 1) {
            paymentOption = "Credit Card";
        } else if (choice == 2) {
            paymentOption = "PayPal";
        }
        JOptionPane.showMessageDialog(null, "Payment option set to: " + paymentOption);
    }
    }
