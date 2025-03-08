package exceptions;

public class ArithmeticExce2 {
        public static void main(String[] args) {
            try {
                int result = 10 / 0;  // This will cause ArithmeticException
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }
        }
    }