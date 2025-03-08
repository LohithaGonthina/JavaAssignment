package array;
import java.util.HashSet;
public class DuplicateArray {
   
    public static void findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println("Duplicate: " + num);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        findDuplicates(arr);
    }
}
