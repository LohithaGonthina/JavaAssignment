package loops;

public class OneToTen {
        public static void main(String[] args) {
            int number = 1;
    
            System.out.println("Numbers from 1 to 10:");
            do {
                System.out.print(number + " ");
                number++;  // Increm
            } while (number <= 10); 
        }
    }