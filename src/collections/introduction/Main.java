package collections.introduction;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // ============================
        // LIST - ARRAYLIST
        // ============================

        System.out.println("===== ARRAYLIST =====");

        // 1. DECLARATION
        List<Integer> arrayList = new ArrayList<>();

        // 2. ADD ELEMENTS
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        // 3. DISPLAY THE ARRAYLIST
        System.out.println(arrayList);

        // 4. ACCESS AN ELEMENT USING get()
        System.out.println(arrayList.get(1));

        // 5. REMOVE AN ELEMENT USING INDEX
        arrayList.remove(0);

        // 6. DISPLAY THE UPDATED ARRAYLIST
        System.out.println(arrayList);



        // ============================
        // LIST - LINKEDLIST
        // ============================

        System.out.println("\n===== LINKEDLIST =====");

        // 1. DECLARATION
        List<Integer> linkedList = new LinkedList<>();

        // 2. ADD ELEMENTS
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        // 3. DISPLAY THE LINKEDLIST
        System.out.println(linkedList);

        // 4. ACCESS AN ELEMENT USING get()
        System.out.println(linkedList.get(1));

        // 5. REMOVE AN ELEMENT USING INDEX
        linkedList.remove(0);

        // 6. DISPLAY THE UPDATED LINKEDLIST
        System.out.println(linkedList);



        // ============================
        // LIST - VECTOR
        // ============================

        System.out.println("\n===== VECTOR =====");

        // 1. DECLARATION
        Vector<Integer> vector = new Vector<>();

        // 2. ADD ELEMENTS
        vector.add(1);
        vector.add(2);
        vector.add(3);

        // 3. DISPLAY THE VECTOR
        System.out.println(vector);

        // 4. GET THE FIRST ELEMENT
        System.out.println(vector.firstElement());

        // 5. GET THE CURRENT CAPACITY
        System.out.println(vector.capacity());



        // ============================
        // LIST - STACK
        // ============================

        System.out.println("\n===== STACK =====");

        // 1. DECLARATION
        Stack<Integer> stack = new Stack<>();

        // 2. PUSH ELEMENTS
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // 3. DISPLAY THE STACK
        System.out.println(stack);

        // 4. VIEW THE TOP ELEMENT
        System.out.println(stack.peek());

        // 5. REMOVE THE TOP ELEMENT
        stack.pop();

        // 6. DISPLAY THE UPDATED STACK
        System.out.println(stack);



        // ============================
        // SET - HASHSET
        // ============================

        System.out.println("\n===== HASHSET =====");

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
        TreeSet<Integer> treeSet = new TreeSet<>();

        // 2. ADD ELEMENTS (Automatically sorted)
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(10);

        // 3. DISPLAY THE TREESET
        System.out.println(treeSet);

        // 4. GET THE FIRST (SMALLEST) ELEMENT
        System.out.println(treeSet.first());

        // 5. GET THE LAST (LARGEST) ELEMENT
        System.out.println(treeSet.last());

        // 6. REMOVE AN ELEMENT
        treeSet.remove(20);

        // 7. DISPLAY THE UPDATED TREESET
        System.out.println(treeSet);

    }
}