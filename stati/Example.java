package stati;

public class Example {

    
        static int staticVar1 = 10;
        static int staticVar2 = 20;
    
        
        int instanceVar1 = 30;
        int instanceVar2 = 40;
    
    
        public static void staticMethod1() {
            System.out.println("Static Method 1");
        }
    
        public static void staticMethod2() {
            System.out.println("Static Method 2");
        }
    
        
        public void instanceMethod1() {
            System.out.println("Instance Method 1");
        }
    
    
        public void instanceMethod2() {
            System.out.println("Instance Method 2");
        }
    
        public static void main(String[] args) {
            System.out.println("Main Method");
        }
    }