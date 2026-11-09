package collections.queue;
import java.util.*;
public class PriorityQueueMethods {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(50);
        pq.offer(10);
        pq.offer(40);
        pq.offer(20);
        pq.offer(30);

        System.out.println(pq);

        //1. convert PriorityQueue into an array
        Object[] arr = pq.toArray();

        //2. print array
        System.out.println(Arrays.toString(arr));

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        pq1.offer(50);
        pq1.offer(10);
        pq1.offer(40);
        pq1.offer(20);
        pq1.offer(30);

//1. create Iterator
        Iterator<Integer> it1 = pq1.iterator();

//2. traverse elements
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}
