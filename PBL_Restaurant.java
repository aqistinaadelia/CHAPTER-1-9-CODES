import javax.swing.*;
import java.util.ArrayList;

public class Restaurant {
    private double totalPrice = 0.0;
    private ArrayList<String> userCartArray = new ArrayList<>();
    private ArrayList<Double> userCartPrices = new ArrayList<>();

    public void showRestaurant() {
        String title = "LockedUpMunchies";
        String[] restaurantsList = {"RBS", "Shafah", "BBB Tomyam", "Ayam Gepuk Top Global", "Duang Dee", "FUD's Burger", "Catering Ikma"};
        boolean restaurant = true;
        String[] menuButtons = {"Add to cart", "Back", "View Cart"};
        String[] cartButtons = {"Checkout", "Add more items"};
        ImageIcon basketIcon = new ImageIcon("basket.png");
        ImageIcon cartIcon = new ImageIcon("cart.gif");

        while (restaurant) {
            String selectedRestaurant = (String) JOptionPane.showInputDialog(null, "Choose a restaurant for your order", title,
                    JOptionPane.INFORMATION_MESSAGE, null, restaurantsList, restaurantsList[0]);

            if (selectedRestaurant != null) {
                String[] menuItems;
                double[] menuPrices;
                switch (selectedRestaurant) {
                    case "RBS":
                        menuItems = new String[]{"Nasi Goreng Mamak", "Mee Goreng Mamak", "Roti Canai", "Roti Telur"};
                        menuPrices = new double[]{7.00, 6.00, 1.50, 2.50};
                        break;
                    case "Shafah":
                        menuItems = new String[]{"Nasi Goreng Mamak", "Mee Goreng Mamak", "Roti Canai", "Roti Telur"};
                        menuPrices = new double[]{7.00, 6.00, 1.50, 2.50};
                        break;
                    case "BBB Tomyam":
                        menuItems = new String[]{"Tomyam Campur", "Tomyam Seafood", "Telur Bungkus", "Daging Masak Merah"};
                        menuPrices = new double[]{7.00, 8.50, 5.50, 6.00};
                        break;
                    case "Ayam Gepuk Top Global":
                        menuItems = new String[]{"Ayam Gepuk SET A", "Ayam Gepuk SET B", "Ayam Gepuk SET C", "Ayam Gepuk SET D"};
                        menuPrices = new double[]{13.50, 14.50, 15.50, 16.50};
                        break;
                    case "Duang Dee":
                        menuItems = new String[]{"Nasi Goreng Cina", "Nasi Goreng Pattaya", "Tomyam Campur", "Kailan Ikan Masin"};
                        menuPrices = new double[]{5.00, 5.50, 7.00, 4.50};
                        break;
                    case "FUD's Burger":
                        menuItems = new String[]{"Cheeseburger", "Chicken Burger", "Vegan Burger", "Nasi Goreng Chicken Chop"};
                        menuPrices = new double[]{6.50, 6.00, 7.50, 11.50};
                        break;
                    case "Catering Ikma":
                        menuItems = new String[]{"Nasi Putih Lauk", "Briyani", "Nasi Minyak", "Nasi Arab"};
                        menuPrices = new double[]{3.00, 8.00, 8.50, 11.00};
                        break;
                    default:
                        menuItems = new String[]{"Item not found"};
                        menuPrices = new double[]{0.0};
                }

                String selectedMenuItem = (String) JOptionPane.showInputDialog(null, "Choose a menu item", title,
                        JOptionPane.INFORMATION_MESSAGE, null, menuItems, menuItems[0]);

                if (selectedMenuItem != null) {
                    int itemIndex = java.util.Arrays.asList(menuItems).indexOf(selectedMenuItem);
                    double itemPrice = menuPrices[itemIndex];

                    int choice = JOptionPane.showOptionDialog(null, "Add " + selectedMenuItem + " (RM " + String.format("%.2f", itemPrice) + ") to cart?", title,
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, basketIcon, menuButtons, 0);

                    if (choice == JOptionPane.YES_OPTION) {
                        userCartArray.add(selectedMenuItem);
                        userCartPrices.add(itemPrice);
                        totalPrice += itemPrice;
                        JOptionPane.showMessageDialog(null, selectedMenuItem + " has been added to your cart.", title, JOptionPane.INFORMATION_MESSAGE);
                    } else if (choice == JOptionPane.CANCEL_OPTION) {
                        StringBuilder cartContents = new StringBuilder("Your Cart:\n");
                        for (int i = 0; i < userCartArray.size(); i++) {
                            cartContents.append(userCartArray.get(i)).append(" - RM ").append(String.format("%.2f", userCartPrices.get(i))).append("\n");
                        }
                        cartContents.append("\nTotal Price: RM ").append(String.format("%.2f", totalPrice));

                        int choice2 = JOptionPane.showOptionDialog(null, cartContents.toString() + "\n\nProceed to checkout?", title, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, cartIcon, cartButtons, 0);
                        if (choice2 == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(null, "Proceed to checkout", title, JOptionPane.INFORMATION_MESSAGE);
                            restaurant = false;
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Exiting the program", title, JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public ArrayList<String> getUserCartArray() {
        return userCartArray;
    }

    public ArrayList<Double> getUserCartPrices() {
        return userCartPrices;
    }
}
