package accessmodifiers;

public class AccessFour {
        public static void main(String[] args) {
            
            class A {
                public int number = 10;
                public void display() {
                    System.out.println("Class A: Number = " + number);
                }
            }
    
            A a = new A();
            System.out.println("Accessing public field: " + a.number);
            a.display();  
            
            class B {
                void accessPublicMembers() {
                    A aFromB = new A();
                    System.out.println("Class B accessing public field: " + aFromB.number);
                    aFromB.display();  
                }
            }
    
            B b = new B();
            b.accessPublicMembers();  
        }
    }