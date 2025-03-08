package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class CollExce {
    

    public static void main(String[] args) {
        
        // Create an ArrayList of Strings with 10 elements
        ArrayList<String> list = new ArrayList<>();
        
        // Adding 10 string elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grapes");
        list.add("Honeydew");
        list.add("Indian Fig");
        list.add("Jackfruit");
        
        // 1. Add an element to the ArrayList
        list.add("Kiwi"); // Adding "Kiwi" to the ArrayList
        System.out.println("After adding 'Kiwi': " + list);

        // 2. Iterate through the ArrayList using an Iterator
        System.out.println("\nIterating through the ArrayList:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 3. Add an element at a specific index
        list.add(2, "Coconut"); // Adding "Coconut" at index 2
        System.out.println("\nAfter adding 'Coconut' at index 2: " + list);

        // 4. Remove an element from the ArrayList (by element)
        list.remove("Fig"); // Removing the element "Fig"
        System.out.println("\nAfter removing 'Fig': " + list);

        // 5. Remove an element at a specific index
        list.remove(4); // Removing element at index 4
        System.out.println("\nAfter removing element at index 4: " + list);

        // 6. Update the element at a specific index
        list.set(3, "Dragonfruit"); // Updating the element at index 3 to "Dragonfruit"
        System.out.println("\nAfter updating element at index 3 to 'Dragonfruit': " + list);

        // 7. Check if an element is present at a particular index
        String elementAtIndex5 = list.get(5); // Get element at index 5
        System.out.println("\nElement at index 5: " + elementAtIndex5);

        // 8. Get an element at a particular index
        String elementAtIndex7 = list.get(7); // Get element at index 7
        System.out.println("\nElement at index 7: " + elementAtIndex7);

        // 9. Find out the size of the ArrayList
        System.out.println("\nSize of ArrayList: " + list.size());

        // 10. Check if a given element is present in the ArrayList
        boolean isPresent = list.contains("Banana"); // Checking if "Banana" is in the ArrayList
        System.out.println("\nIs 'Banana' present in the ArrayList? " + isPresent);

        // 11. Remove all elements from the ArrayList
        list.clear(); // Clearing all elements from the ArrayList
        System.out.println("\nAfter removing all elements: " + list);
    }
}