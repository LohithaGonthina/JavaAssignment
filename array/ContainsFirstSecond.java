package array;

public class ContainsFirstSecond {
        public static boolean containsTwoElements(int[] arr, int elem1, int elem2) {
            boolean containsFirst = false, containsSecond = false;
            for (int num : arr) {
                if (num == elem1) containsFirst = true;
                if (num == elem2) containsSecond = true;
            }
            return containsFirst && containsSecond;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("Contains 2 and 4: " + containsTwoElements(arr, 2, 4));
        }
    }