package stati;

public class Sixth {
        static int staticVar1 = 10;
    
    
        int instanceVar1 = 30;
    
        public static void main(String[] args) {
            
            System.out.println("Static Variable 1: " + staticVar1);
            
            Example example = new Example();
            System.out.println("Instance Variable 1: " + example.instanceVar1);
        }
    }