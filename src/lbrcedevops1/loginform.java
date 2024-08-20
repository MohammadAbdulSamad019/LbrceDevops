package lbrcedevops1;
import java.util.Scanner;
public class loginform
{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Please enter your name: ");
        // Read the input from the user
        String userName = scanner.nextLine();

        // Print a welcome message including the user's name
        System.out.println("Welcome to the app, " + userName + "!");

        // Close the scanner to free up resources
        scanner.close();
    }
}