package collections.introduction;
import java.util.*;
public class QueueIntro
{

    public static void main(String[] args) {

        // ============================
        // QUEUE - PRIORITYQUEUE
        // ============================

        System.out.println("===== PRIORITYQUEUE =====");

        // 1. DECLARATION
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // 2. ADD ELEMENTS
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);

        // 3. DISPLAY THE PRIORITYQUEUE
        System.out.println(priorityQueue);

        // 4. VIEW THE FRONT ELEMENT
        System.out.println(priorityQueue.peek());

        // 5. REMOVE THE FRONT ELEMENT
        priorityQueue.poll();

        // 6. DISPLAY THE UPDATED PRIORITYQUEUE
        System.out.println(priorityQueue);



        // ============================
        // QUEUE - ARRAYDEQUE
        // ============================

        System.out.println("\n===== ARRAYDEQUE =====");

        // 1. DECLARATION
        Queue<Integer> arrayDeque = new ArrayDeque<>();

        // 2. ADD ELEMENTS
        arrayDeque.offer(10);
        arrayDeque.offer(20);
        arrayDeque.offer(30);

        // 3. DISPLAY THE ARRAYDEQUE
        System.out.println(arrayDeque);

        // 4. VIEW THE FRONT ELEMENT
        System.out.println(arrayDeque.peek());

        // 5. REMOVE THE FRONT ELEMENT
        arrayDeque.poll();

        // 6. DISPLAY THE UPDATED ARRAYDEQUE
        System.out.println(arrayDeque);



        // ============================
        // ARRAYDEQUE SPECIFIC METHODS
        // ============================

        System.out.println("\n===== ARRAYDEQUE SPECIFIC METHODS =====");

        // 1. DECLARATION
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // 2. ADD ELEMENTS
        deque.add(20);
        deque.add(30);

        // 3. ADD ELEMENT AT THE FRONT
        deque.addFirst(10);

        // 4. ADD ELEMENT AT THE REAR
        deque.addLast(40);

        // 5. DISPLAY THE ARRAYDEQUE
        System.out.println(deque);

        // 6. REMOVE THE FIRST ELEMENT
        deque.removeFirst();

        // 7. REMOVE THE LAST ELEMENT
        deque.removeLast();

        // 8. DISPLAY THE UPDATED ARRAYDEQUE
        System.out.println(deque);



        // ============================
        // QUEUE - LINKEDLIST
        // ============================

        System.out.println("\n===== LINKEDLIST =====");

        // 1. DECLARATION
        Queue<Integer> linkedList = new LinkedList<>();

        // 2. ADD ELEMENTS
        linkedList.offer(100);
        linkedList.offer(200);
        linkedList.offer(300);

        // 3. DISPLAY THE LINKEDLIST
        System.out.println(linkedList);

        // 4. VIEW THE FRONT ELEMENT
        System.out.println(linkedList.peek());

        // 5. REMOVE THE FRONT ELEMENT
        linkedList.poll();

        // 6. DISPLAY THE UPDATED LINKEDLIST
        System.out.println(linkedList);



        // ============================
        // LINKEDLIST AS QUEUE
        // ============================

        System.out.println("\n===== LINKEDLIST AS QUEUE =====");

        // 1. DECLARATION
        LinkedList<Integer> queue = new LinkedList<>();

        // 2. ADD ELEMENTS
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // 3. ADD ELEMENT AT THE FRONT
        queue.addFirst(5);

        // 4. ADD ELEMENT AT THE REAR
        queue.addLast(40);

        // 5. DISPLAY THE LINKEDLIST
        System.out.println(queue);

        // 6. REMOVE THE FIRST ELEMENT
        queue.removeFirst();

        // 7. REMOVE THE LAST ELEMENT
        queue.removeLast();

        // 8. DISPLAY THE UPDATED LINKEDLIST
        System.out.println(queue);

    }
}