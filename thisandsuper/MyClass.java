package thisandsuper;

public class MyClass {
        int a, b;
    
        MyClass(int x, int y) {
            this.a = x;
            this.b = y;
            System.out.println("Constructor with two arguments called");
        }
    
      
        MyClass(int x) {
            this(x, 0); 
            System.out.println("Constructor with one argument called");
        }
    
        MyClass() {
            this(0, 0);  
            System.out.println("Constructor with no arguments called");
        }
    
        void display() {
            System.out.println("a: " + a + ", b: " + b);
        }
    
        public static void main(String[] args) {
           
            MyClass obj1 = new MyClass();
            obj1.display();  
    
            MyClass obj2 = new MyClass(5);
            obj2.display(); 

            MyClass obj3 = new MyClass(5, 10);
            obj3.display();  
        } 
    } 
