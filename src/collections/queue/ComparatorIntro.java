package collections.queue;
import java.util.*;
public class ComparatorIntro {
    public static void main(String[] args) {

        //COMPARATOR IS USED FOR THE CUSTOM PRIORITY CREATION

        Comparator<Integer> comp = (a,b) ->Integer.compare(b,a);
        PriorityQueue<Integer> pq = new PriorityQueue<>(comp);

        pq.offer(100);
        pq.offer(15);
        pq.offer(1000);
        pq.offer(105);
        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}
