package collections.queue;
import java.util.*;
public class ArrayDequeMethods {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        // METHODS THAT WILL NOT CAUSE EXCEPTION IF DEQUE IS EMPTY

        dq.offerFirst(100);       //1. add element at front
        dq.offerLast(90);         //2. add element at rear
        dq.offerFirst(80);
        dq.offerLast(70);

        System.out.println(dq);

        dq.pollFirst();           //3. remove element from front
        dq.pollLast();            //4. remove element from rear

        System.out.println(dq);

        System.out.println(dq.peekFirst());  //5. return front element
        System.out.println(dq.peekLast());   //6. return rear element


        // METHODS THAT CAN CAUSE EXCEPTION IF DEQUE IS EMPTY

        dq.addFirst(10);          //7. add element at front
        dq.addLast(20);           //8. add element at rear
        dq.push(30);              //9. add element at front

        System.out.println(dq);

        dq.removeFirst();         //10. remove element from front
        dq.removeLast();          //11. remove element from rear
        dq.pop();                 //12. remove element from front
        System.out.println(dq);

        System.out.println(dq.getFirst());  //13. return front element
        System.out.println(dq.getLast());   //14. return rear element
    }
}
