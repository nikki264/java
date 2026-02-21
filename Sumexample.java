import java.util.Scanner;

class SumExample {

    // Constructor Overloading
    SumExample(int a, int b, int c) {
        System.out.println("Sum of 3 integers: " + (a + b + c));
    }

    SumExample(double a, double b) {
        System.out.println("Sum of 2 decimals: " + (a + b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 integers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        new SumExample(x, y, z);

        System.out.println("Enter 2 decimal numbers:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        new SumExample(d1, d2);
    }
}
