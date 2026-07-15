package collections.introduction;
import java.util.*;
public class ListIntro
{

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
        // LINKEDLIST SPECIFIC METHODS
        // ============================

        System.out.println("\n===== LINKEDLIST SPECIFIC METHODS =====");

        // 1. DECLARATION
        LinkedList<Integer> list = new LinkedList<>();

        // 2. ADD ELEMENTS
        list.add(20);
        list.add(30);

        // 3. ADD ELEMENT AT THE FIRST
        list.addFirst(10);

        // 4. ADD ELEMENT AT THE LAST
        list.addLast(40);

        // 5. DISPLAY THE LINKEDLIST
        System.out.println(list);

        // 6. GET THE FIRST ELEMENT
        System.out.println(list.getFirst());

        // 7. GET THE LAST ELEMENT
        System.out.println(list.getLast());



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
        // VECTOR SPECIFIC METHODS
        // ============================

        System.out.println("\n===== VECTOR SPECIFIC METHODS =====");

        // 1. DECLARATION
        Vector<Integer> vec = new Vector<>();

        // 2. ADD ELEMENTS
        vec.add(100);
        vec.add(200);
        vec.add(300);

        // 3. DISPLAY THE VECTOR
        System.out.println(vec);

        // 4. DISPLAY THE FIRST ELEMENT
        System.out.println(vec.firstElement());

        // 5. DISPLAY THE LAST ELEMENT
        System.out.println(vec.lastElement());

        // 6. DISPLAY THE CAPACITY
        System.out.println(vec.capacity());



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
        // STACK SPECIFIC METHODS
        // ============================

        System.out.println("\n===== STACK SPECIFIC METHODS =====");

        // 1. DECLARATION
        Stack<Integer> stk = new Stack<>();

        // 2. PUSH ELEMENTS
        stk.push(100);
        stk.push(200);
        stk.push(300);

        // 3. DISPLAY THE STACK
        System.out.println(stk);

        // 4. VIEW THE TOP ELEMENT
        System.out.println(stk.peek());

        // 5. SEARCH FOR AN ELEMENT
        System.out.println(stk.search(200));

        // 6. CHECK WHETHER THE STACK IS EMPTY
        System.out.println(stk.empty());

    }
}