import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Login {
    public void loginFunction() {
        String[] loginButtons = {"Login", "Cancel"};
        String title = "LockedUpMunchies";
        boolean bool = true;
        String trueLogin = "testAccount123";
        String trueLogin2 = "NanaHebat123";
        String truePassword = "Saitama123";
        String truePassword2 = "Nana123";
        String trueLogin3 = "Wisyiii05";
        String truePassword3 = "Wisyiii123";
        ImageIcon userIcon = new ImageIcon("sigma.png");
        ImageIcon userIcon2 = new ImageIcon("Kucing.png");
        ImageIcon userIcon3 = new ImageIcon("Awisywibu.png");

        while (bool) {
            String loginUsername = JOptionPane.showInputDialog(null, "Enter Username", title, JOptionPane.INFORMATION_MESSAGE);
            
            // Check if user clicked "Cancel" or closed the dialog
            if (loginUsername == null) {
                System.exit(0);
            }

            if (loginUsername.equals(trueLogin)) {
                String loginPassword = JOptionPane.showInputDialog(null, "Enter Password", title, JOptionPane.INFORMATION_MESSAGE);

                // Check if user clicked "Cancel" or closed the dialog
                if (loginPassword == null) {
                    System.exit(0);
                }

                if (loginPassword.equals(truePassword)) {
                    int choice = JOptionPane.showOptionDialog(null, "Is this your account?\n" + loginUsername, title,
                            JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, userIcon, loginButtons, 0);
                    
                    if (choice == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Welcome!", title, JOptionPane.INFORMATION_MESSAGE);
                        bool = false;  // Exit loop on successful login
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Password, Try Again", title, JOptionPane.ERROR_MESSAGE);
                }
            }
            else if (loginUsername.equals(trueLogin2)) {
                String loginPassword = JOptionPane.showInputDialog(null, "Enter Password", title, JOptionPane.INFORMATION_MESSAGE);

                // Check if user clicked "Cancel" or closed the dialog
                if (loginPassword == null) {
                    System.exit(0);
                }

                if (loginPassword.equals(truePassword2)) {
                    int choice = JOptionPane.showOptionDialog(null, "Is this your account?\n" + loginUsername, title,
                            JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, userIcon2, loginButtons, 0);
                    
                    if (choice == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Welcome!", title, JOptionPane.INFORMATION_MESSAGE);
                        bool = false;  // Exit loop on successful login
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Password, Try Again", title, JOptionPane.ERROR_MESSAGE);
                }
            }
            else if (loginUsername.equals(trueLogin3)) {
                String loginPassword = JOptionPane.showInputDialog(null, "Enter Password", title, JOptionPane.INFORMATION_MESSAGE);

                // Check if user clicked "Cancel" or closed the dialog
                if (loginPassword == null) {
                    System.exit(0);
                }

                if (loginPassword.equals(truePassword3)) {
                    int choice = JOptionPane.showOptionDialog(null, "Is this your account?\n" + loginUsername, title,
                            JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, userIcon3, loginButtons, 0);
                    
                    if (choice == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Welcome!", title, JOptionPane.INFORMATION_MESSAGE);
                        bool = false;  // Exit loop on successful login
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Password, Try Again", title, JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username, Try Again", title, JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
