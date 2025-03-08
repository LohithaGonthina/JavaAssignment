package thisandsuper;

public class ThisThree {


        public ThisThree() {
            System.out.println("Default constructor called");
        }
    
        public ThisThree(String name) {
           
            this();  
            System.out.println("Parameterized constructor called with name: " + name);
        }
    
        public static void main(String[] args) {
    
            ThisThree obj = new ThisThree("John");
            System.out.println("Object created: " + obj);
        }
    }
