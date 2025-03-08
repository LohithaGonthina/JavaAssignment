package string;

public class StringMatchesExample {
        public static void main(String[] args) {
            String str1 = "Hello123";
            String str2 = "hello123";
            String str3 = "12345";
            String str4 = "Hello!";
    
            System.out.println("str1 matches '^[A-Za-z0-9]+$' : " + str1.matches("^[A-Za-z0-9]+$"));
    
            System.out.println("str2 matches '^[0-9]+$' : " + str2.matches("^[0-9]+$"));
    
            System.out.println("str3 matches '^[0-9]+$' : " + str3.matches("^[0-9]+$"));
    
            System.out.println("str4 matches '^[A-Za-z]+$' : " + str4.matches("^[A-Za-z]+$"));
    
            System.out.println("str1 matches '^[H][A-Za-z]+$' : " + str1.matches("^[H][A-Za-z]+$"));
        }
    }
