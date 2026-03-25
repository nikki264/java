//Bank Validation System
import java.util.Scanner;  // Importing Scanner class

// User-defined Exception for Invalid Age
class InvalidAgeException extends Exception
{
    // Constructor
    InvalidAgeException(String message)
    {
        super(message);  // calling parent class constructor
    }
}

// User-defined Exception for Insufficient Balance
class InsufficientBalanceException extends Exception
{
    InsufficientBalanceException(String message)
    {
        super(message);
    }
}

// Main class
class AdvancedException
{
    // Method using 'throws'
    static void validateAge(int age) throws InvalidAgeException
    {
        if(age < 18)
        {
            // throwing exception manually
/* new: “Create an object”, since 'InvalidAgeException' is a child class which should be accessed from
main class only through objects*/
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }

    static void withdraw(double balance, double amount) throws InsufficientBalanceException
    {
        if(amount > balance)
        {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        else
        {
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + (balance - amount));
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        try
        {
            // ===== STRING HANDLING =====
            System.out.print("Enter your name: ");
            String name = scan.nextLine();  // reading string

            // trim removes extra spaces
            name = name.trim();

            // checking empty string
            if(name.isEmpty())
            {
                throw new Exception("Name cannot be empty!");
            }

            // ===== AGE INPUT =====
            System.out.print("Enter your age: ");
            String ageInput = scan.nextLine();  // read as string

            // converting string to integer
            int age = Integer.parseInt(ageInput); // may throw NumberFormatException

            validateAge(age);  // calling method

            // ===== BALANCE INPUT =====
            System.out.print("Enter account balance: ");
            double balance = Double.parseDouble(scan.nextLine());
            //input numbers will be considered as strings
            /*1.	scan.nextLine() → reads input as String
               2.	parseDouble() → converts to double
               If input is: abc
               Throws: NumberFormatException*/

            if(balance < 0)
            {
                throw new Exception("Balance cannot be negative!");
            }

            // ===== WITHDRAW =====
            System.out.print("Enter withdrawal amount: ");
            double amount = Double.parseDouble(scan.nextLine());

            withdraw(balance, amount);

            System.out.println("Welcome " + name + "! Transaction completed.");
        }

        // Built-in exception
        catch(NumberFormatException e)
        {
            System.out.println("Error: Please enter valid numeric values.");
        }

        // User-defined exception
        //'throw new InvalidAgeException("Age must be 18+");'
        //we throw the error now catch the error 'e' with function getMessage() as e.getMessage()
        catch(InvalidAgeException e) //e = object of exception
        {
            System.out.println("Error: " + e.getMessage());
        }
/*e.getMessage()
means:
“Get message stored in this exception object”
*/

        catch(InsufficientBalanceException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        // Generic exception
        catch(Exception e)
        {
            System.out.println("General Error: " + e.getMessage());
        }

        finally
        {
            System.out.println("Thank you for using the system.");
            scan.close();
        }

        System.out.println("End of program.");
    }
}
