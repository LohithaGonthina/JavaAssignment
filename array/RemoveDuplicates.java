package array;
import java.util.HashSet;
public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] newArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            newArr[i++] = num;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] newArr = removeDuplicates(arr);
        System.out.print("Array without duplicates: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}