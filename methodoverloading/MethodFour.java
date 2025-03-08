package methodoverloading;

public class MethodFour {

        static void display(int a) {
            System.out.println("Display method with an integer: " + a);
        }
    
       
        static void display(String a) {
            System.out.println("Display method with a string: " + a);
        }
    
        public static void main(String[] args) {
            
            display(10);       
            display("Hello!");  
        }
    }
