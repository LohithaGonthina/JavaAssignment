package loops;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a string or number
        System.out.print("Enter a number or string: ");
        String input = scanner.nextLine();  // Read the input as a string
        
        // Remove spaces and convert to lowercase for comparison
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Check if the cleaned input is a palindrome
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();
        
        // Compare the cleaned input with its reverse
        if (cleanedInput.equals(reversedInput)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
            // Close the scanner
            scanner.close();
        }
    }
}