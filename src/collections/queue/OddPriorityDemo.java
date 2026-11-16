package collections.queue;
import java.util.*;
public class OddPriorityDemo {

    public static void main(String[] args) {

        Comparator<Integer> compo = (a, b) ->
        {
            if (a % 2 != 0 && b % 2 == 0) {
                return -1;
            }
            if (a % 2 == 0 && b % 2 != 0) {
                return 1;
            }
            return Integer.compare(a, b);
        };

        PriorityQueue<Integer> pqr = new PriorityQueue<>(compo);

        pqr.offer(18);
        pqr.offer(10);
        pqr.offer(7);
        pqr.offer(8);
        pqr.offer(15);

        System.out.println("ODD NUMBER GETS HIGHER PRIORITY");
        while(!pqr.isEmpty()) {
            System.out.println(pqr.poll());
        }
    }

}
