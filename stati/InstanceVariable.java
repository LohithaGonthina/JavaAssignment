package stati;

public class InstanceVariable {
    
        int instanceVar = 30;
    
        
        public static void staticMethod() {
        
            InstanceVariable example = new InstanceVariable();
            System.out.println("Instance Variable: " + example.instanceVar);
        }
    
        public static void main(String[] args) {
            
            staticMethod();
        }
    }