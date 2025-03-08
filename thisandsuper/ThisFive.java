package thisandsuper;

public class ThisFive {
        public static void main(String[] args) {
            class Parent {
                int a;

                Parent(int x) {
                    a = x;
                    System.out.println("Parent class constructor called with value: " + a);
                }
            }

            class Child extends Parent {
                int b;

                Child(int x, int y) {
                    super(x);  
                    b = y;
                    System.out.println("Child class constructor called with value: " + b);
                }
    
                void display() {
                    System.out.println("Parent value a: " + a + ", Child value b: " + b);
                }
            }
    
         
            // Parent parentObj = new Parent(10);  
    
    
            Child childObj = new Child(20, 30); 
    
            childObj.display();  
        }
    }