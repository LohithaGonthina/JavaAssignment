package array;

public class MissingNumber {
        public static int findMissingNumber(int[] arr) {
            int expectedSum = 100 * (100 + 1) / 2; // Sum of numbers from 1 to 100
            int actualSum = 0;
            for (int num : arr) {
                actualSum += num;
            }
            return expectedSum - actualSum;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println("Missing number: " + findMissingNumber(arr));
        }
    }