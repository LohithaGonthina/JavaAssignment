package loops;

    import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a number limit
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();
        
        // Print even numbers
        System.out.println("Even numbers from 1 to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                // Close the scanner object
                scanner.close();
            }
        }

        // Print a new line before printing odd numbers
        System.out.println();

        // Print odd numbers
        System.out.println("Odd numbers from 1 to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
