package accessmodifiers;

public class AccessThree {
        public static void main(String[] args) {
            class A {
                protected int number = 10;
                protected void display() {
                    System.out.println("Class A: Number = " + number);
                }
            }
            class B extends A {
                void accessProtectedMembers() {
                    System.out.println("Class B: Accessing protected field in subclass: " + number);
                    display();  
                }
            }
            A a = new A();
            System.out.println("Accessing protected field in the same package: " + a.number);
            a.display(); 
            B b = new B();
            b.accessProtectedMembers();
        }
    }
