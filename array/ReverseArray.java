package array;

public class ReverseArray {
    
        public static int[] reverseArray(int[] arr) {
            int[] reversed = new int[arr.length];
            int j = 0;
            
            for (int i = arr.length - 1; i >= 0; i--) {
                reversed[j++] = arr[i];
            }
            return reversed;
        }
    
       
        public static void main(String[] args) {
            
            int[] arr = {1, 2, 3, 4, 5};
            
           
            System.out.print("Original Array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            
           
            int[] reversedArr = reverseArray(arr);
            
            
            System.out.print("\nReversed Array: ");
            for (int num : reversedArr) {
                System.out.print(num + " ");
            }
        }
    }