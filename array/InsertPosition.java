package array;

public class InsertPosition {
        public static int[] insertAtPosition(int[] arr, int element, int position) {
            int[] newArray = new int[arr.length + 1];
            for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == position) {
                    newArray[i] = element;
                } else {
                    newArray[i] = arr[j++];
                }
            }
            return newArray;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int[] newArr = insertAtPosition(arr, 10, 2);
            System.out.print("Array after inserting 10 at position 2: ");
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        }
    }