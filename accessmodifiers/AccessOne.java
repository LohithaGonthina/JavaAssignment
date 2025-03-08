package accessmodifiers;

public class AccessOne {
        private int privateField1 = 10;
    
        private void privateMethod() {
            System.out.println("Private Method Called");
        }
    
        public static void main(String[] args) {
            AccessOne example = new AccessOne();
            
            System.out.println("Private Field 1: " + example.privateField1);
    
            example.privateMethod();
        }
    }
