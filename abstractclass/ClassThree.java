package abstractclass;

public class ClassThree {
        public static void main(String[] args) {
            
            abstract class Animal {
                abstract void sound();
                
                void eat() {
                    System.out.println("This animal is comming.");
                }
            }
            
            class Dog extends Animal {
                @Override
                void sound() {
                    System.out.println("Bow! Bow!");
                }
                
                void createInstanceAndCallMethods() {
                    Dog dog = new Dog();
                    dog.sound();
                    dog.eat();
                }
            }
            
            Dog dogInstance = new Dog();
            dogInstance.createInstanceAndCallMethods();
        }
    }
    