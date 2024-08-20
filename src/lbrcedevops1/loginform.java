import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Login Form");
        
        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a panel to hold the form components
        JPanel panel = new JPanel();
        
        // Create labels and text fields for username and password
        JLabel userLabel = new JLabel("Username:");
        JTextField userTextField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        
        // Create a login button
        JButton loginButton = new JButton("Login");
        
        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve input values
                String username = userTextField.getText();
                String password = new String(passwordField.getPassword());
                
                // Perform simple validation (for demonstration purposes)
                if (username.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password");
                }
            }
        });
        
        // Add components to the panel
        panel.add(userLabel);
        panel.add(userTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        
        // Add panel to the frame
        frame.add(panel);
        
        // Set the frame size and make it visible
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
