package inheritance;

public class InheritFour {
        public static void main(String[] args) {
            
            // Class A
            class A {
                void methodA1() {
                    System.out.println("Class A: Method 1");
                }
    
                void overriddenMethod() {
                    System.out.println("Class A: Overridden Method");
                }
            }
    
            // Class B (inherits from A)
            class B extends A {
                void methodB1() {
                    System.out.println("Class B: Method 1");
                }
    
                @Override
                void overriddenMethod() {
                    System.out.println("Class B: Overridden Method");
                }
            }
    
            // Class C (inherits from B)
            class C extends B {
                void methodC1() {
                    System.out.println("Class C: Method 1");
                }
    
    
                @Override
                void overriddenMethod() {
                    System.out.println("Class C: Overridden Method");
                }
            }
    
            // Creating objects of each class
            A a = new A();
            B b = new B();
            C c = new C();
    
            // Calling methods from Class A
            a.methodA1();
            a.overriddenMethod();  // Calls A's overridden method
    
            // Calling methods from Class B
            b.methodB1();
            b.overriddenMethod();  // Calls B's overridden method
    
            // Calling methods from Class C
            c.methodC1();
            c.overriddenMethod();  // Calls C's overridden method
        }
    }