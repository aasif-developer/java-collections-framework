package collections.queue;
import java.util.*;
public class ComparatorIntro {
    public static void main(String[] args) {

        //COMPARATOR IS USED FOR THE CUSTOM PRIORITY CREATION

        Comparator<Integer> comp = (a, b) -> Integer.compare(b, a);
        PriorityQueue<Integer> pq = new PriorityQueue<>(comp);

        pq.offer(100);
        pq.offer(15);
        pq.offer(1000);
        pq.offer(105);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        Comparator<Integer> com = (a, b) ->
        {
            if (a % 2 == 0 && b != 0) {
                return -1;
            }
            if (a % 2 != 0 && b == 0) {
                return 1;
            }
            return Integer.compare(a, b);
        };
        pq=new PriorityQueue<>(com);
        pq.offer(24);
        pq.offer(15);
        pq.offer(13);
        pq.offer(180);
        System.out.println("EVEN NUMBER HAS HIGHER PRIORITY");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}
