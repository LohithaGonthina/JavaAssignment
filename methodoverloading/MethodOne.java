package methodoverloading;

public class MethodOne {
    
    
        static void display(int a) {
            System.out.println("Display method with one integer: " + a);
        }
    
   
        static void display(int a, int b) {
            System.out.println("Display method with two integers: " + a + " and " + b);
        }
    
        public static void main(String[] args) {
            
            display(10);      
            display(10, 20);  
        }
    }
