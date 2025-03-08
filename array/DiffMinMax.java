package array;

public class DiffMinMax {
        public static int differenceMinMax(int[] arr) {
            int min = arr[0];
            int max = arr[0];
            for (int num : arr) {
                if (num < min) min = num;
                if (num > max) max = num;
            }
            return max - min;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("Difference between max and min: " + differenceMinMax(arr));
        }
    }