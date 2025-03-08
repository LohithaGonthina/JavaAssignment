package array;

public class RemoveOfElement {
        public static int[] removeElement(int[] arr, int target) {
            int count = 0;
    
            for (int num : arr) {
                if (num == target) {
                    count++;
                }
            }
    
           
            if (count == 0) {
                return arr;
            }
    
         
            int[] result = new int[arr.length - count];
            int j = 0;
    
          
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != target) {
                    result[j++] = arr[i];
                }
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int[] newArr = removeElement(arr, 3);
    
            System.out.print("Array after removing 3: ");
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        }
    }