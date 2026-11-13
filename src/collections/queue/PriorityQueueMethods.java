package collections.queue;
import java.util.*;
public class PriorityQueueMethods {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        //1.Default accessing of a PriorityQueue(Ascending order)

        pq.offer(40);
        pq.offer(20);
        pq.offer(50);
        pq.offer(10);
        pq.offer(30);
        pq.offer(5);

        System.out.println(pq);  //representation of internal heap

        System.out.println("1.PRIORITY : SMALLER NUMBER HAS HIGHER PRIORITY[eg:RANK]");

        System.out.println(pq.poll());
        System.out.println(pq);
        while(pq.isEmpty())
        {
            System.out.println(pq.poll());  //poll - returns the top most element
        }

        System.out.println("2.PRIORITY : LARGER NUMBER HAS HIGHER PRIORITY");





    }
}
