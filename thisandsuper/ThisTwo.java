package thisandsuper;

public class ThisTwo {
        public static void main(String[] args) {
            // Parent class code
            class Vehicle {
                // Instance members (fields)
                String model;
                int year;
    
                // Constructor to initialize fields
                public Vehicle(String model, int year) {
                    this.model = model;
                    this.year = year;
                }
    
                // Method to print the vehicle details
                public void printVehicleDetails() {
                    System.out.println("Vehicle Model: " + model);
                    System.out.println("Vehicle Year: " + year);
                }
            }
    
            // Child class code
            class Car extends Vehicle {
                // Constructor to initialize parent class fields using super
                public Car(String model, int year) {
                    super(model, year);  // Call parent constructor to initialize fields
                }
    
                // Method to display parent class fields using 'super'
                public void displayVehicleDetails() {
                    // Access parent class fields using 'super'
                    System.out.println("From Car class:");
                    System.out.println("Model from parent: " + super.model);  // Accessing the parent class field 'model'
                    System.out.println("Year from parent: " + super.year);    // Accessing the parent class field 'year'
    
                    // Optionally, you can call the parent class method using 'super'
                    super.printVehicleDetails();  // Calling the parent class method to print vehicle details
                }
            }
    
            // Create an object of the Car class
            Car car = new Car("Toyota Corolla", 2022);
    
            // Display parent class fields and method using super
            car.displayVehicleDetails();
        }
    }