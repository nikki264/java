import java.util.Scanner; // Import Scanner class to take input from user

// Parent class
class Operation {

    // Method to be overridden by child classes
    void calculate(int number) {
        System.out.println("Generic operation"); //
}

// Child class for Square calculation
class Square extends Operation {/*"extends" means:
/*“Child class can use parent class code.”
Real-Life Example
Parent: Vehicle
Child: Car
Car automatically gets:
engine()
wheels()
speed()
This is inheritance.*/

    // Overriding calculate method
    void calculate(int number) {
        System.out.println("Square of " + number + " is: " + (number * number));
    }
}

// Child class for Cube calculation
class Cube extends Operation {

    // Overriding calculate method
    void calculate(int number) {
        System.out.println("Cube of " + number + " is: " + (number * number * number));
    }
}

// Main class
public class MethodBinding {

    public static void main(String[] args) {

        // Creating Scanner object named 'scan'
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scan.nextInt(); // Reading number from user

        // Displaying menu to user
        System.out.println("Choose operation:");
        System.out.println("1. Square");
        System.out.println("2. Cube");
        int choice = scan.nextInt();
        Operation op;
        if (choice == 1) // then 'op' is going to store square address
        {
            op = new Square(); 
        } else 
        {
            op = new Cube();   
        }
        op.calculate(num);

        // Closing scanner
        scan.close();
    }
}
