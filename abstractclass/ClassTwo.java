package abstractclass;

public class ClassTwo {
        public static void main(String[] args) {
            
          
            abstract class Animal {
                
                abstract void sound();
                
              
                void eat() {
                    System.out.println("This animal is eating.");
                }
            }
            
           
            class Dog extends Animal {
               
                @Override
                void sound() {
                    System.out.println("Woof! Woof!");
                }
            }
            
           
            Dog dog = new Dog();
            
         
            dog.eat();  
            
        
            dog.sound();  
        }
    }
    