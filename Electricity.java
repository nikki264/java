//Electricity Bill Generation at Runtime Domestic, Commercial
package electricitysystem;  // Defining package

import java.util.Scanner;   // Importing Scanner class from java.util package


// First interface defining bill calculation rule
interface BillCalculator
{
    // Interface constant (public static final automatically)
    double RATE = 5.0;

    // Method declaration (abstract method)
    double calculateBill(int units);
}


// Second interface defining tax rule
interface TaxCalculator
{
    double calculateTax(double bill);
}


// Interface extending two interfaces
interface SmartBilling extends BillCalculator, TaxCalculator
{
    void displayConnectionType();
}


// Class implementing interface
class DomesticConnection implements SmartBilling
{

    // Implementing calculateBill method
    public double calculateBill(int units)
    {
        return units * RATE;
    }

    // Implementing calculateTax method
    public double calculateTax(double bill)
    {
        return bill * 0.05;
    }

    public void displayConnectionType()
    {
        System.out.println("Connection Type: Domestic");
    }
}


// Another class implementing same interface
class CommercialConnection implements SmartBilling
{

    public double calculateBill(int units)
    {
        return units * (RATE + 3);
    }

    public double calculateTax(double bill)
    {
        return bill * 0.10;
    }

    public void displayConnectionType()
    {
        System.out.println("Connection Type: Commercial");
    }
}


// Main program
public class Electricity
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);  // Creating Scanner object

        System.out.println("Enter Consumer Name:");
        String name = scan.nextLine();  // Taking name input

        System.out.println("Enter Units Consumed:");
        int units = scan.nextInt();  // Taking units input

        System.out.println("Choose Connection Type");
        System.out.println("1 Domestic");
        System.out.println("2 Commercial");

        int choice = scan.nextInt(); // User choice


        // Interface reference variable
        SmartBilling connection;//operation op


        if(choice == 1)
        {
            connection = new DomesticConnection();
        }
        else
        {
            connection = new CommercialConnection();
        }


        connection.displayConnectionType();

        double bill = connection.calculateBill(units);

        double tax = connection.calculateTax(bill);

        double total = bill + tax;


        System.out.println("Consumer Name: " + name);
        System.out.println("Units Consumed: " + units);
        System.out.println("Bill Amount: " + bill);
        System.out.println("Tax Amount: " + tax);
        System.out.println("Total Bill: " + total);

        scan.close();
    }
}
