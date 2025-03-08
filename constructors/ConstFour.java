package constructors;

public class ConstFour {
        public static void main(String[] args) {
      
            class MyClass {
                public int myConstructor(int value) {
                    System.out.println("Constructor with int argument called");
                    return value;
                }
    
                public String myConstructor(String msg) {
                    System.out.println("Constructor with String argument called");
                    return msg;
                }
            }
    
            MyClass obj = new MyClass();
    
      
            int intValue = obj.myConstructor(10);     
            String stringValue = obj.myConstructor("Hello");  
    
            System.out.println("Returned int value: " + intValue);
            System.out.println("Returned String value: " + stringValue);
        }
    }
