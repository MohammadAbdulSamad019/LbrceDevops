package lbrcedevops1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class signup {

    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Sign-Up System!");

        while (true) {
            System.out.print("Enter a username: ");
            String username = scanner.nextLine();

            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            // Simple validation
            if (validateUsername(username) && validatePassword(password)) {
                User newUser = new User(username, password);
                users.add(newUser);
                System.out.println("Sign-up successful! Welcome, " + username + "!");
                break; // Exit the loop after successful sign-up
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        scanner.close();
    }

    private static boolean validateUsername(String username) {
        // Simple validation: username must be non-empty
        return !username.trim().isEmpty();
    }

    private static boolean validatePassword(String password) {
        // Simple validation: password must be at least 6 characters long
        return password.length() >= 6;
    }

    // Inner class to represent a user
    private static class User {
        private String username;
        private String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        // Getters and setters (if needed)
        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }
}
