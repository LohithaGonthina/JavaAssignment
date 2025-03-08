package inheritance;

public class InheritFive {
        public static void main(String[] args) {
            
            
            class A {
                void overriddenMethod() {
                    System.out.println("Class A: Overridden Method");
                }
            }
    
            
            class B extends A {
                @Override
                void overriddenMethod() {
                    System.out.println("Class B: Overridden Method");
                }
            }
    
            class C extends B {
                @Override
                void overriddenMethod() {
                    System.out.println("Class C: Overridden Method");
                }
            }
    
            A aRefB = new B();  
            A aRefC = new C();  
    
        
            aRefB.overriddenMethod();  
            aRefC.overriddenMethod();  
        }
    }