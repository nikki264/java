//with exception
import java.util.Scanner;  // Import Scanner class for user input

// Main class
class withExceptionHandling
{
    public static void main(String[] args)
    {
        // Creating Scanner object to read input from keyboard
        Scanner scan = new Scanner(System.in);

        // Declaring variables
        int numerator = 0;     // stores first number
        int denominator = 0;   // stores second number
        int result = 0;        // stores result of division

        try
        {
            // Asking user to enter numerator
            System.out.print("Enter numerator (integer): ");
            numerator = scan.nextInt();  // reading integer input

            // Asking user to enter denominator
            System.out.print("Enter denominator (integer): ");
            denominator = scan.nextInt();  // reading integer input

            // Performing division (may cause exception if denominator = 0)
            result = numerator / denominator;

            // Printing result if no exception occurs
            System.out.println("Result = " + result);
        }

        // Handling ArithmeticException (division by zero)
        catch (ArithmeticException e)
        {
            System.out.println("Error: Cannot divide by zero!");
        }

        // Handling wrong input (like string instead of number)
        catch (Exception e)
        {
            System.out.println("Error: Invalid input! Please enter integers only.");
        }

        finally
        {
            // This block always executes
            System.out.println("Program executed successfully (with or without exception).");

            // Closing scanner (good practice)
            scan.close();
        }

        // Program continues normally
        System.out.println("End of program.");
    }
}
