package exceptions;

public class CaughtExce {
        public static void main(String[] args) {
            try {
                throw new Exception("This is my custom exception message!");
            } catch (Exception e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }
    }