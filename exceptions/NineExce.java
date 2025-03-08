package exceptions;

public class NineExce {
        public static void main(String[] args) {
            int[] arr = new int[5];
            System.out.println(arr[10]);  // This will cause ArrayIndexOutOfBoundsException
        }
    }