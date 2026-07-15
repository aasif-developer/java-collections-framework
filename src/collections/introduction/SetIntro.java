package collections.introduction;
import java.util.*;
public class SetIntro
{

    public static void main(String[] args) {

        // ============================
        // SET - HASHSET
        // ============================

        System.out.println("===== HASHSET =====");

        // 1. DECLARATION
        Set<Integer> hashSet = new HashSet<>();

        // 2. ADD ELEMENTS (Duplicates are ignored)
        hashSet.add(30);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10);

        // 3. DISPLAY THE HASHSET
        System.out.println(hashSet);

        // 4. CHECK IF AN ELEMENT EXISTS
        System.out.println(hashSet.contains(20));

        // 5. REMOVE AN ELEMENT
        hashSet.remove(20);

        // 6. DISPLAY THE UPDATED HASHSET
        System.out.println(hashSet);



        // ============================
        // SET - LINKEDHASHSET
        // ============================

        System.out.println("\n===== LINKEDHASHSET =====");

        // 1. DECLARATION
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        // 2. ADD ELEMENTS (Maintains insertion order)
        linkedHashSet.add(30);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(10);

        // 3. DISPLAY THE LINKEDHASHSET
        System.out.println(linkedHashSet);

        // 4. CHECK IF AN ELEMENT EXISTS
        System.out.println(linkedHashSet.contains(20));

        // 5. REMOVE AN ELEMENT
        linkedHashSet.remove(20);

        // 6. DISPLAY THE UPDATED LINKEDHASHSET
        System.out.println(linkedHashSet);



        // ============================
        // SET - TREESET
        // ============================

        System.out.println("\n===== TREESET =====");

        // 1. DECLARATION
        Set<Integer> treeSet = new TreeSet<>();

        // 2. ADD ELEMENTS (Automatically sorted)
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(10);

        // 3. DISPLAY THE TREESET
        System.out.println(treeSet);

        // 4. CHECK IF AN ELEMENT EXISTS
        System.out.println(treeSet.contains(20));

        // 5. GET THE FIRST (SMALLEST) ELEMENT
        System.out.println(treeSet.iterator().next());

        // 6. REMOVE AN ELEMENT
        treeSet.remove(20);

        // 7. DISPLAY THE UPDATED TREESET
        System.out.println(treeSet);



        // ============================
        // TREESET SPECIFIC METHODS
        // ============================

        System.out.println("\n===== TREESET SPECIFIC METHODS =====");

        TreeSet<Integer> tree = new TreeSet<>();

        tree.add(50);
        tree.add(10);
        tree.add(30);
        tree.add(20);

        // 1. DISPLAY THE TREESET
        System.out.println(tree);

        // 2. GET THE FIRST ELEMENT
        System.out.println(tree.first());

        // 3. GET THE LAST ELEMENT
        System.out.println(tree.last());

    }
}