package constructors;

public class ConstTwo {

        public static void main(String[] args) {
  
            class Parent {
                public Parent() {
                    System.out.println("Parent class constructor called");
                }
    
                public Parent(int x) {
                    System.out.println("Parent class constructor with value: " + x);
                }
            }
    
            class Child extends Parent {
                public Child() {
                    super();  
                    System.out.println("Child class constructor called");
                }
    
                public Child(int x) {
                    super(x);  
                    System.out.println("Child class constructor with value: " + x);
                }
            }
    
            new Child();           
            new Child(10);        
        }
    }
