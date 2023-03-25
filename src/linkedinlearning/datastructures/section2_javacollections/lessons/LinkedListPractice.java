package linkedinlearning.datastructures.section2_javacollections.lessons;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author john-michael.obrien
 * @since 3/20/23
 *
 * Linked Lists maintain order based on when items are added.
 * Each item holds a reference to the prev/next items in the list.
 * Can add an item to the linked list quickly by specifying the index, item.
 * ArrayLists quicker for randomly accessing elements, but Linked Lists quicker for adding
 * and deleting elements from the list.
 */
public class LinkedListPractice {
    public static void main (String[] args) {
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pear");
        System.out.println(shoppingList);

        shoppingList.add(1, "mango");
        System.out.println(shoppingList);

        shoppingList.removeFirst();
        System.out.println(shoppingList);

        List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList); // thread safe
        System.out.println(synchronizedShoppingList);

        synchronizedShoppingList.remove(2);
        System.out.println(synchronizedShoppingList);  // modifying synchronizedShoppingList modifies shoppingList
        System.out.println(shoppingList);

        shoppingList.removeFirst();
        System.out.println(shoppingList); // modifying shoppingList also modifies synchronizedShoppingList
        System.out.println(synchronizedShoppingList);
    }
}
