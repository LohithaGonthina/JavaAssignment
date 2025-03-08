package abstractclass;

public class ClassFour {
        public static void main(String[] args) {
            
            abstract class Animal {
                void eat() {
                    System.out.println("This animal is eating.");
                }
            }
            
            class Dog extends Animal {
                void play() {
                    System.out.println("The dog is playing.");
                }
                
                void createInstanceAndCallNonAbstractMethods() {
                    Dog dog = new Dog();
                    dog.eat();
                    dog.play();
                }
            }
            
            Dog dogInstance = new Dog();
            dogInstance.createInstanceAndCallNonAbstractMethods();
        }
    }
    