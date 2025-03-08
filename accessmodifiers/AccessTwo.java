package accessmodifiers;

public class AccessTwo {
        public static void main(String[] args) {
            
        class A {
                
                int number = 10;
                
                
                void display() {
                    System.out.println("Class A: Number = " + number);
                }
            }
            
            A a = new A();
            
            System.out.println("Accessing default field: " + a.number);
            a.display();  
        }
    }