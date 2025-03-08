package string;

public class IndexOfExample {
        public static void main(String[] args) {
           
            String str = "Hello, World!";
           
            int indexChar = str.indexOf('W');
            System.out.println("The index of 'W': " + indexChar);
    
            int indexSubstring = str.indexOf("World");
            System.out.println("The index of 'World': " + indexSubstring);
           
            int indexCharFrom = str.indexOf('o', 5);
            System.out.println("The index of 'o' starting from index 5: " + indexCharFrom);
    
            int indexSubstringFrom = str.indexOf("World", 5);
            System.out.println("The index of 'World' starting from index 5: " + indexSubstringFrom);
    
            int indexNotFound = str.indexOf("Java");
            System.out.println("The index of 'Java' (not found): " + indexNotFound);
        }
    }