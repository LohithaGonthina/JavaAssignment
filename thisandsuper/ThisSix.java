package thisandsuper;

public class ThisSix {
        public static void main(String[] args) {
   
            class Parent {
                void display() {
                    System.out.println("Parent class display method");
                }
                
                void parentMethod() {
                    System.out.println("Parent class method");
                }
            }
    
            class Child extends Parent {
                void display() {
 
                    super.display();
                    System.out.println("Child class display method");
                }
    
                void childMethod() {
                    System.out.println("Child class method");
                    this.display();  // Calling Child's own display method using 'this'
                }
    
                void callParentMethod() {
                    // Calling the Parent class's method using super()
                    super.parentMethod();
                }
            }
    
            Child childObj = new Child();
    
            childObj.childMethod();
 
            childObj.callParentMethod();
        }
    }
