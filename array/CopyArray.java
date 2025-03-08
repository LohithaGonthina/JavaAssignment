package array;

public class CopyArray {
        public static int[] copyArray(int[] arr) {
            int[] newArray = new int[arr.length];
            System.arraycopy(arr, 0, newArray, 0, arr.length);
            return newArray;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int[] copiedArr = copyArray(arr);
            System.out.print("Copied Array: ");
            for (int num : copiedArr) {
                System.out.print(num + " ");
            }
        }
    }