package collections;
import java.util.HashMap;
public class CollSec {
 

    public static void main(String[] args) {

        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eve");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Hannah");
        studentMap.put(109, "Ivy");
        studentMap.put(110, "Jack");

        
        studentMap.put(111, "Kathy"); 
        System.out.println("After inserting a new student: " + studentMap);

       
        String studentName = studentMap.get(103); 
        System.out.println("\nThe student with ID 103 is: " + studentName);


        HashMap<Integer, String> clonedMap = new HashMap<>(studentMap);
        System.out.println("\nCloned map: " + clonedMap);

     
        boolean isKeyPresent = studentMap.containsKey(107); 
        System.out.println("\nIs student ID 107 present in the map? " + isKeyPresent);

       
        boolean isValuePresent = studentMap.containsValue("Eve");
        System.out.println("\nIs 'Eve' present in the map? " + isValuePresent);

        
        boolean isEmpty = studentMap.isEmpty(); 
        System.out.println("\nIs the map empty? " + isEmpty);

       
        int size = studentMap.size();
        System.out.println("\nSize of the map: " + size);

       
        System.out.println("\nAll student IDs (Keys) in the map:");
        for (Integer key : studentMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nAll student names (Values) in the map:");
        for (String value : studentMap.values()) {
            System.out.println(value);
        }

        studentMap.remove(105); 
        System.out.println("\nAfter removing student with ID 105: " + studentMap);

        HashMap<Integer, String> newMap = new HashMap<>(studentMap);
        System.out.println("\nNew map after copying elements: " + newMap);
    }
}
