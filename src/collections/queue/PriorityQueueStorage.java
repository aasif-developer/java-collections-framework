package collections.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueStorage {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(10);
        pq.offer(14);
        pq.offer(11);
        pq.offer(13);
        pq.offer(12);

        System.out.println(pq);

        System.out.println("1.STORING INSIDE A VARIABLE (inside loop)");
        System.out.println("THE ELEMENTS ARE :");
        while(!pq.isEmpty())
        {
            Integer rank = pq.poll();

            System.out.println(rank);
        }
        pq = new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("2.USING A STRING VARIABLE");
        pq.offer(10);
        pq.offer(14);
        pq.offer(11);
        pq.offer(13);
        pq.offer(12);
        String rank ="";
        while(!pq.isEmpty())
        {
            rank+=pq.poll()+" ";
        }
        System.out.println("THE ELEMENTS IN DESCENDING ORDER :"+rank);
    }
}
