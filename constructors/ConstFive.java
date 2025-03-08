package constructors;

public class ConstFive {

        public static void main(String[] args) {
            
            class MyClass {
                public MyClass() {
                    System.out.println("Constructor called");
                }
    
                public void simulateConstructorCall() {
                    System.out.println("Simulating constructor call again");
                }
            }
    
            MyClass obj = new MyClass();     
    
            
            obj.simulateConstructorCall();   
            obj.simulateConstructorCall();   
        }
    }
