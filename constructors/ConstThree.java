package constructors;

public class ConstThree {

        public static void main(String[] args) {
        
            class MyClass {
    
                public MyClass(int x) {
                    System.out.println("Public constructor called with value: " + x);
                }
    
                protected MyClass(int x, int y) {
                    System.out.println("Protected constructor called with values: " + x + " and " + y);
                }
    
                MyClass(String msg) {
                    System.out.println("Default constructor called with message: " + msg);
                }
            }
    
            new MyClass(5);               
            new MyClass(10, 20);           
            new MyClass("Hello");         
        }
    }