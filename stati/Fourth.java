package stati;

public class Fourth {
    
        public static void staticMethod() {
            
            Fourth example = new Fourth();
            example.instanceMethod();
        }
     
        public void instanceMethod() {
            System.out.println("Instance Method Called");
        }
        public static void main(String[] args) {
            staticMethod();
        }
    }