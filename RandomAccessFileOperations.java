import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.Scanner;

class RandomAccessFileOperations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {

            // Open file in read & write mode
            RandomAccessFile file = new RandomAccessFile("student.dat", "rw");

            int choice;

            do {

                System.out.println("\n----- RANDOM ACCESS FILE MENU -----");
                System.out.println("1. Write Data");
                System.out.println("2. Read Entire File");
                System.out.println("3. Read First Record");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scan.nextInt();

                switch (choice) {

                    case 1:
                        // Move pointer to end for appending
                        file.seek(file.length());

                        System.out.print("Enter Roll Number: ");
                        int roll = scan.nextInt();
                        scan.nextLine();  // clear buffer

                        System.out.print("Enter Name: ");
                        String name = scan.nextLine();

                        file.writeInt(roll);
                        file.writeUTF(name);

                        System.out.println("Record written successfully!");
                        break;

                    case 2:
                        // Read entire file
                        file.seek(0);

                        System.out.println("\n--- File Contents ---");

                        while (file.getFilePointer() < file.length()) {

                            int r = file.readInt();
                            String n = file.readUTF();

                            System.out.println("Roll: " + r + "  Name: " + n);
                        }
                        break;

                    case 3:
                        // Read first record only
                        if (file.length() > 0) {
                            file.seek(0);

                            int r = file.readInt();
                            String n = file.readUTF();

                            System.out.println("First Record:");
                            System.out.println("Roll: " + r + "  Name: " + n);
                        } else {
                            System.out.println("File is empty!");
                        }
                        break;

                    case 4:
                        System.out.println("Program Ended.");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 4);

            file.close();
            scan.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
