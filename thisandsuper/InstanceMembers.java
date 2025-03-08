package thisandsuper;

public class InstanceMembers {
    class Person {
        String name;
        int age;
    
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void printFields() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
        }
    

        public static void main(String[] args) {
         
            InstanceMembers instance = new InstanceMembers();
            Person person = instance.new Person("Alice", 30);
    

            person.printFields();
        }
    }
}