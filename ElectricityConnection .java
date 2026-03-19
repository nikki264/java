import java.util.Scanner;   // Import Scanner class for user input
// Parent Class
// Abstract class (cannot be instantiated directly)
abstract class ElectricityConnection
{
    protected int units;      // Protected instance variable only accessible to subclass, but not outside classes as public

    // Constructor of parent class
    ElectricityConnection(int units)//from super(units);  
// int units = Local variable
    {
        this.units = units;   // this = Assigning input units (Local Variable) to instance variable (protected int units; )
    }

    // Abstract method (no body), only to force child class to calculateBill
    abstract double calculateBill();

    // Normal method
    void displayConnection()
    {
        System.out.println("Generic Electricity Connection");
    }

    // final method (cannot be overridden by child class)
    final void rules()
    {
        System.out.println("Government electricity rules applied.");
    }
}

// Subclass inheriting from ElectricityConnection
class DomesticConnection extends ElectricityConnection
{

    // Constructor of subclass
    DomesticConnection(int units)//int units = Local Variable
    {
        super(units);  // Calling parent constructor
    }

    // Overriding abstract method
    @Override
    double calculateBill()
    {
        return units * 5.5;   // method body Bill calculation 
    }

    // Overriding parent method
    @Override
    void displayConnection()
    {
        System.out.println("Domestic Electricity Connection");
    }
}

// Main class
public class ElectricityBillSystem
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // Scanner object

        System.out.println("Enter consumed electricity units:");
        int units = scan.nextInt();  // Taking user input

        // Base class reference variable (polymorphism)
        ElectricityConnection obj;//as like operation op
/*Parent class = ElectricityConnection , Variable to access Classes = ‘obj’ as like student ‘s’*/

        // Creating subclass or child class object
        obj = new DomesticConnection(units);
//*arguments = units from ‘int units = scan.nextInt();’ */

        // Calling overridden method
        obj.displayConnection();

        // Calling abstract implemented method
        double bill = obj.calculateBill();

        // Display result
        System.out.println("Total Bill = " + bill);

        // Calling final method
        obj.rules();

        // Using Object class method
        System.out.println("Class Name: " + obj.getClass());
/*class will be accessed through object in main method
If we want to see which class the object is accessing, we use getClass()*/

        scan.close(); // Closing scanner
    }
}
