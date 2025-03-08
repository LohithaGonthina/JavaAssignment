package string;

public class StringExample {
        public static void main(String[] args) {
            
            String str1 = "Hello, World!";
            System.out.println("Using String Literal: " + str1);
    
            String str2 = new String("Hello, World!");
            System.out.println("Using new Keyword: " + str2);
            
            StringBuilder str3 = new StringBuilder("Hello");
            str3.append(", World!");
            System.out.println("Using StringBuilder: " + str3);
            
            StringBuffer str4 = new StringBuffer("Hello");
            str4.append(", World!");
            System.out.println("Using StringBuffer: " + str4);
            
            char[] charArray = {'H', 'e', 'l', 'l', 'o'};
            String str5 = new String(charArray);
            System.out.println("Using char[]: " + str5);
            
            String str6 = String.format("Hello, %s! Today is %s.", "Alice", "Monday");
            System.out.println("Using String.format(): " + str6);
        
            String str7 = "Hello".concat(", World!");
            System.out.println("Using String.concat(): " + str7);
            
            String str8 = String.join(", ", "Hello", "World", "Java");
            System.out.println("Using String.join(): " + str8);
            
            int number = 123;
            String str9 = String.valueOf(number);
            System.out.println("Using String.valueOf(): " + str9);
        }
    }