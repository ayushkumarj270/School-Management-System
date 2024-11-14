import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginWindow extends JFrame implements ActionListener {
    private JPasswordField passwordField;
    private JButton loginButton;
    private JCheckBox showPassword;

    // Constructor to set up the GUI
    public LoginWindow() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a panel for the login form
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        // Password field
        panel.add(new JLabel("Password:"));
        passwordField = new JPasswordField(20);
        panel.add(passwordField);

        // Show Password checkbox
        showPassword = new JCheckBox("Show Password");
        showPassword.addActionListener(this);
        panel.add(showPassword);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        panel.add(loginButton);

        // Add the panel to the frame
        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);  // Show password
            } else {
                passwordField.setEchoChar('*');  // Hide password
            }
        } else if (e.getSource() == loginButton) {
            String password = new String(passwordField.getPassword());
            if (password.equals("adminPassword")) { // Replace with the correct password
                JOptionPane.showMessageDialog(this, "Login Successful!");
                // Proceed to main window
                new MainWindow(); // Make sure MainWindow is implemented
                dispose(); // Close the login window
            } else {
                JOptionPane.showMessageDialog(this, "Invalid password!");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginWindow().setVisible(true));
    }
}