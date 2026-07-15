package collections.introduction;
import java.util.*;
public class MapIntro
{
    public static void main(String[] args) {

        // ============================
        // MAP - HASHMAP
        // ============================

        System.out.println("===== HASHMAP =====");

        // 1. DECLARATION
        Map<Integer, String> hashMap = new HashMap<>();

        // 2. ADD KEY-VALUE PAIRS
        hashMap.put(101, "Aasif");
        hashMap.put(102, "Ahmed");
        hashMap.put(103, "Rahul");

        // 3. DISPLAY THE HASHMAP
        System.out.println(hashMap);

        // 4. GET VALUE USING KEY
        System.out.println(hashMap.get(102));

        // 5. REMOVE A KEY-VALUE PAIR
        hashMap.remove(101);

        // 6. DISPLAY THE UPDATED HASHMAP
        System.out.println(hashMap);



        // ============================
        // MAP - LINKEDHASHMAP
        // ============================

        System.out.println("\n===== LINKEDHASHMAP =====");

        // 1. DECLARATION
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // 2. ADD KEY-VALUE PAIRS
        linkedHashMap.put(101, "Aasif");
        linkedHashMap.put(102, "Ahmed");
        linkedHashMap.put(103, "Rahul");

        // 3. DISPLAY THE LINKEDHASHMAP
        System.out.println(linkedHashMap);

        // 4. GET VALUE USING KEY
        System.out.println(linkedHashMap.get(102));

        // 5. REMOVE A KEY-VALUE PAIR
        linkedHashMap.remove(101);

        // 6. DISPLAY THE UPDATED LINKEDHASHMAP
        System.out.println(linkedHashMap);



        // ============================
        // MAP - TREEMAP
        // ============================

        System.out.println("\n===== TREEMAP =====");

        // 1. DECLARATION
        Map<Integer, String> treeMap = new TreeMap<>();

        // 2. ADD KEY-VALUE PAIRS
        treeMap.put(103, "Rahul");
        treeMap.put(101, "Aasif");
        treeMap.put(102, "Ahmed");

        // 3. DISPLAY THE TREEMAP
        System.out.println(treeMap);

        // 4. GET VALUE USING KEY
        System.out.println(treeMap.get(102));

        // 5. REMOVE A KEY-VALUE PAIR
        treeMap.remove(101);

        // 6. DISPLAY THE UPDATED TREEMAP
        System.out.println(treeMap);



        // ============================
        // TREEMAP SPECIFIC METHODS
        // ============================

        System.out.println("\n===== TREEMAP SPECIFIC METHODS =====");

        // 1. DECLARATION
        TreeMap<Integer, String> tree = new TreeMap<>();

        // 2. ADD KEY-VALUE PAIRS
        tree.put(103, "Rahul");
        tree.put(101, "Aasif");
        tree.put(102, "Ahmed");

        // 3. DISPLAY THE TREEMAP
        System.out.println(tree);

        // 4. GET THE FIRST KEY
        System.out.println(tree.firstKey());

        // 5. GET THE LAST KEY
        System.out.println(tree.lastKey());

        // 6. DISPLAY THE VALUE OF THE FIRST ENTRY
        System.out.println(tree.firstEntry());

        // 7. DISPLAY THE VALUE OF THE LAST ENTRY
        System.out.println(tree.lastEntry());



        // ============================
        // MAP - HASHTABLE
        // ============================

        System.out.println("\n===== HASHTABLE =====");

        // 1. DECLARATION
        Map<Integer, String> hashtable = new Hashtable<>();

        // 2. ADD KEY-VALUE PAIRS
        hashtable.put(101, "Aasif");
        hashtable.put(102, "Ahmed");
        hashtable.put(103, "Rahul");

        // 3. DISPLAY THE HASHTABLE
        System.out.println(hashtable);

        // 4. GET VALUE USING KEY
        System.out.println(hashtable.get(102));

        // 5. REMOVE A KEY-VALUE PAIR
        hashtable.remove(101);

        // 6. DISPLAY THE UPDATED HASHTABLE
        System.out.println(hashtable);

    }
}