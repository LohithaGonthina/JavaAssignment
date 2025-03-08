package inheritance;

public class InheritSix {
    public static void main(String[] args) {
        
        class A {
            int data = 10;

            int getData() {
                return data;
            }
        }

        class B extends A {
            int data = 20;

            @Override
            int getData() {
                return data;
            }
        }

        class C extends B {
            int data = 30;

            @Override
            int getData() {
                return data;
            }
        }

        A aRefB = new B();
        A aRefC = new C();

        System.out.println("aRefB.data: " + aRefB.getData());
        System.out.println("aRefC.data: " + aRefC.getData());
    }
}
