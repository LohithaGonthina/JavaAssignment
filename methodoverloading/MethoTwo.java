package methodoverloading;

public class MethoTwo {

    
     
        static void display(int a) {
            System.out.println("Display method with one integer: " + a);
        }
    
        static void display(String a) {
            System.out.println("Display method with one string: " + a);
        }
    
       
        static void display(int a, String b) {
            System.out.println("Display method with an integer and a string: " + a + " and " + b);
        }
    
        public static void main(String[] args) {
       
            display(10);           
            display("Hello");      
            display(5, "World");    
        }
    }
