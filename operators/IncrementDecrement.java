package operators;

public class IncrementDecrement {
        public static int increment(int num) {
            return num + 1;
        }
    
        public static int decrement(int num) {
            return num - 1;
        }
    
        public static void main(String[] args) {
            int num = 10;
    
            num = increment(num);
            System.out.println("After increment: " + num); 
    
            num = decrement(num);
            System.out.println("After decrement: " + num);  
        }
    }
