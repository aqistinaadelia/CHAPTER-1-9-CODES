import javax.swing.JOptionPane;
import java.util.ArrayList;

public class LockedUpMunchies {
    public static void main(String[] args) {
        Login login = new Login();
        Restaurant restaurantSelection = new Restaurant();
        PaymentOptions paymentOptions = new PaymentOptions();
        DeliveryOptions deliveryOptions = new DeliveryOptions();

        login.loginFunction();
        restaurantSelection.showRestaurant();
        paymentOptions.paymentFunction();
        deliveryOptions.deliveryFunction();

        StringBuilder orderSummary = new StringBuilder("Order Summary:\n");

        ArrayList<String> cartItems = restaurantSelection.getUserCartArray();
        ArrayList<Double> cartPrices = restaurantSelection.getUserCartPrices();

        for (int i = 0; i < cartItems.size(); i++) {
            orderSummary.append(cartItems.get(i)).append(" - RM ").append(String.format("%.2f", cartPrices.get(i))).append("\n");
        }

        orderSummary.append("\nTotal Price: RM ").append(String.format("%.2f", restaurantSelection.getTotalPrice()));

        if (deliveryOptions.getDeliveryOption().equals("Delivery")) {
            orderSummary.append("\nDelivery Address: ").append(deliveryOptions.getDeliveryAddress());
        }

        JOptionPane.showMessageDialog(null, orderSummary.toString(), "LockedUpMunchies", JOptionPane.INFORMATION_MESSAGE);
    }
}
