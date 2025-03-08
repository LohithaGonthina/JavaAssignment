package exceptions;

public class CustomExce {
        public static void main(String[] args) {
            // Custom exception class inside the main method
            class MyCustomException extends Exception {
                public MyCustomException(String message) {
                    super(message);
                }
            }
    
            try {
                // Throwing the custom exception
                throw new MyCustomException("This is my custom exception");
            } catch (MyCustomException e) {
                // Catching the custom exception
                System.out.println("Caught MyCustomException: " + e.getMessage());
            }
        }
    }
