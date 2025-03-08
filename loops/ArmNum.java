package loops;
import java.util.Scanner;
public class ArmNum {
    
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Find the number of digits in the number
        int originalNumber = number;
        int sum = 0;
        int digits = 0;
        
        // Find the number of digits
        while (number != 0) {
            number /= 10;  // Remove the last digit
            digits++;
        }
        
        number = originalNumber;  // Restore the original number
        
        // Calculate the sum of each digit raised to the power of the number of digits
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            sum += Math.pow(digit, digits);  // Add the digit raised to the power of 'digits'
            number /= 10;  // Remove the last digit
        }
        
        // Check if the number is an Armstrong number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
            // Close the scanner
            scanner.close();
        }
    }
}