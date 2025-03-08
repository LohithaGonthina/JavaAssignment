package stati;

public class StaticMethod {

        public static void staticMethod() {
            System.out.println("Static Method Called");
        }
    
        
        public void instanceMethod() {
            staticMethod();  
        }
    
        public static void main(String[] args) {
            StaticMethod example = new StaticMethod();
            example.instanceMethod();
        }
    }