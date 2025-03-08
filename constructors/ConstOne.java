package constructors;

public class ConstOne {
        public static void main(String[] args) {
    
            class MyClass {
                public MyClass() {
                    System.out.println("Default constructor called");
                }
    
                public MyClass(int num) {
                    System.out.println("One-argument constructor called with value: " + num);
                }
    
                public MyClass(int num1, int num2) {
                    System.out.println("Two-argument constructor called with values: " + num1 + " and " + num2);
                }
            }
    
            new MyClass();            
            new MyClass(5);           
            new MyClass(10, 20);       
        }
    }
