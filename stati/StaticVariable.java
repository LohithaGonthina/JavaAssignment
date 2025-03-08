package stati;

public class StaticVariable {
    
        static int staticVar1 = 10;
        
        public void instanceMethod() {
            System.out.println("Static Variable: " + staticVar1);
        }
    
        public static void main(String[] args) {
            StaticVariable example = new StaticVariable();
            example.instanceMethod();
        }
    }