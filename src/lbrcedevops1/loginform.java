import java.util.Scanner;
public class Welcome 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Welcome to the app, " + userName + "!");
        scanner.close();
    }
}