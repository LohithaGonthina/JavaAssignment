package methodoverloading;

public class MethodFive {
    
        static int display(int a) {
            System.out.println("Display method returning an int: " + a);
            return a;
        }
    
   
        static double display(double a) {
            System.out.println("Display method returning a double: " + a);
            return a;
        }
    
        public static void main(String[] args) {
            int intResult = display(10);     
            double doubleResult = display(10.5);  
    
            System.out.println("Returned integer value: " + intResult);
            System.out.println("Returned double value: " + doubleResult);
        }
    }
