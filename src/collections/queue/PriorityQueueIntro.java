package collections.queue;
import java.util.*;
public class PriorityQueueIntro {
    public static void main(String[] args) {
        Queue<String> qt = new PriorityQueue<>();
        qt.offer("AASIF");
        qt.offer("DSA");
        qt.offer("MASTER");
        System.out.println(qt);
        System.out.println(qt.peek());
        System.out.println(qt.poll());
        System.out.println(qt);
        qt.offer("AASIF");
        System.out.println(qt);
        Iterator<String> it = qt.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println();
        for(String str : qt)
        {
            System.out.println(str);
        }
    }
}