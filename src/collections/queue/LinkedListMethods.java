package collections.queue;
import java.util.*;
public class LinkedListMethods {
    public static void main(String[] args) {
        Queue<Integer> qt= new LinkedList<>();
        //methods that will not cause EXCEPTION if the queue is EMPTY
        qt.offer(100);
        qt.offer(90);
        qt.offer(80);       //add element
        qt.offer(70);
        qt.offer(60);
        System.out.println(qt);
        qt.poll();
        System.out.println(qt);
        qt.poll();             //remove element on front
        qt.remove(Integer.valueOf(70));     //remove specific element and exception safe
        System.out.println(qt);
        System.out.println(qt.peek());      //return top element
        //methods that will cause EXCEPTION if the queue is EMPTY
        qt.add(10);
        qt.add(20);
        qt.add(30);     //add element
        qt.add(40);
        qt.add(50);
        System.out.println(qt);
        qt.remove(20);      //remove element (no index wise removal on queue)
        qt.remove(50);
        System.out.println(qt);
        System.out.println(qt.element());       //return top element
    }
}
