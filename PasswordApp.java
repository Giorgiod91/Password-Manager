import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.util.Base64;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

// Creating the Password class with methods for encoding, decoding, and creating passwords
public class PasswordApp extends JFrame {

    private boolean wantsToCreatePassword = false;
    private String password;

    // Constructor for initializing PasswordApp JFrame
    public PasswordApp() {
        // Setting up the window
        setTitle("Encrypt Manager App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create and configure the button
        JButton createPasswordButton = new JButton("Create and Encrypt Password");
        createPasswordButton.setBounds(80, 60, 220, 30); 

        // Add action listener to button
        createPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //method that fires on click
                createThePassword();
            }
        });

        // Add button to the frame
        add(createPasswordButton);
    }

    // Method to get the password (getter)
    public String getPassword() {
        return password;
    }

    // Method to set a new password (setter)
    public void setPassword(String password) {
        this.password = password;
    }

    // Method to encode a password to Base64
    public static String encodeToBase64(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }

    // Method to decode a Base64 password
    public static String decodeFromBase64(String encodedMessage) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedMessage);
        return new String(decodedBytes);
    }

    // Method for creating and encoding a password when the button is pressed
    public void createThePassword() {
        // Ask the user if they want to create a password
        int userResponse = JOptionPane.showConfirmDialog(this, "Create Random Crypted Password?", "Password Creation", JOptionPane.YES_NO_OPTION);

        if (userResponse == JOptionPane.YES_OPTION) {
            String userPassword = JOptionPane.showInputDialog(this, "Enter a Password to Encrypt:");
            if (userPassword != null && !userPassword.isEmpty()) {
                this.password = encodeToBase64(userPassword);
                JTextArea toCopy = new JTextArea(10, 10);
                toCopy.setText(password);

                JOptionPane.showMessageDialog(this, new JScrollPane(toCopy));
               // JOptionPane.showMessageDialog(this, "Your encrypted password is: " + this.password, "Password Encrypted", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Password cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }



    // Main method to start the application
    public static void main(String[] args) {
        // Creating an instance 
        PasswordApp app = new PasswordApp();
        app.setVisible(true); 
    }
}
