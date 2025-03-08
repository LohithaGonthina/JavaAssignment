package basic;

public class VarableScopeDemo {

    static int globalVar = 100;  // Global variable

    public static void main(String[] args) {
        int localVar = 50;  // Local variable
        System.out.println("Local variable: " + localVar);
        System.out.println("Global variable: " + globalVar);
    }
}