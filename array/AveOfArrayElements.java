package array;

public class AveOfArrayElements {
        public static double averageArray(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return (double) sum / arr.length;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("Average of array elements: " + averageArray(arr));
        }
    }