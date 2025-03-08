package inheritance;

public class InheritOne {
    public static void main(String[] args) {
       
        class A {
            void display() {
                System.out.println("This is class A");
            }
        }

        class B {
            void display() {
                System.out.println("This is class B");
            }
        }

        class C {
            void display() {
                System.out.println("This is class C");
            }
        }
        
        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.display();
        objB.display();
        objC.display();
    }
}