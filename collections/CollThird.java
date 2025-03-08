package collections;
import java.util.HashSet;
import java.util.Iterator;
public class CollThird {
   


    public static void main(String[] args) {

        
        HashSet<String> fruitSet = new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");
        fruitSet.add("Mango");
        fruitSet.add("Pineapple");
        fruitSet.add("Grapes");
        fruitSet.add("Peach");
        fruitSet.add("Plum");
        fruitSet.add("Kiwi");
        fruitSet.add("Strawberry");

        System.out.println("Original HashSet: " + fruitSet);

        
        fruitSet.add("Watermelon");
        System.out.println("\nAfter adding 'Watermelon': " + fruitSet);

    
        fruitSet.remove("Peach");
        System.out.println("\nAfter removing 'Peach': " + fruitSet);

        
        boolean containsMango = fruitSet.contains("Mango");
        System.out.println("\nDoes the set contain 'Mango'? " + containsMango);

    
        int size = fruitSet.size();
        System.out.println("\nSize of the HashSet: " + size);

      
        System.out.println("\nIterating through the HashSet:");
        Iterator<String> iterator = fruitSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

       
        fruitSet.clear();
        System.out.println("\nAfter clearing all elements: " + fruitSet);

    
        boolean isEmpty = fruitSet.isEmpty();
        System.out.println("\nIs the HashSet empty? " + isEmpty);

        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");
        fruitSet.add("Mango");
        fruitSet.add("Pineapple");
        fruitSet.add("Grapes");
        fruitSet.add("Peach");
        fruitSet.add("Plum");
        fruitSet.add("Kiwi");
        fruitSet.add("Strawberry");


        HashSet<String> clonedSet = new HashSet<>(fruitSet);
        System.out.println("\nCloned HashSet: " + clonedSet);

       
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Apple");
        anotherSet.add("Banana");
        boolean containsAll = fruitSet.containsAll(anotherSet);
        System.out.println("\nDoes the HashSet contain all elements from another set? " + containsAll);
    }
}
