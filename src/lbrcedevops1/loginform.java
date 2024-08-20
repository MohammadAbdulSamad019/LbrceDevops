import java.util.Scanner;
public class Welcome 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        
        // Read the user's input

        String userName = scanner.nextLine();

        // Display a personalized welcome message

        System.out.println("Welcome to the app, " + userName + "!");



        // Close the Scanner object to prevent resource leaks

        scanner.close();

    }

}