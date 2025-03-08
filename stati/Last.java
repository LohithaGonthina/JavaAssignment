package stati;

public class Last {
        public static void staticMethod() {
            System.out.println("Static Method Called");
        }
    
        public void instanceMethod() {
            System.out.println("Instance Method Called");
        }
    
        public static void main(String[] args) {
            staticMethod();
    
            Last example = new Last();
            example.instanceMethod();
        }
    }