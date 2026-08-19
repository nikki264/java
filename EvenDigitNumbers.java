import java.util.Scanner;

public class EvenDigitNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        String input = sc.nextLine();

        String[] numbers = input.split(" ");
        int count = 0;

        for (String num : numbers) {
            if (num.length() % 2 == 0) {
                count++;
            }
        }

        System.out.println("Output: " + count);
    }
}