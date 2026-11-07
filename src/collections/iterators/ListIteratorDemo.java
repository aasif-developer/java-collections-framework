package collections.iterators;
import java.util.*;
public class ListIteratorDemo {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);
        System.out.println(li);

        ListIterator<Integer> lit = li.listIterator();

        System.out.println("FORWARD TRAVERSAL");
        while(lit.hasNext())
        {
            System.out.println(lit.next());
        }
        System.out.println();
        System.out.println("BACKWARD TRAVERSAL");
        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }
        //Traversal from a particular index
        System.out.println();
        ListIterator<Integer> a = li.listIterator(3);
        System.out.println();
        while(a.hasPrevious())
        {
            System.out.println(a.previous());
        }
        System.out.println();
        ListIterator<Integer> b = li.listIterator(3);
        while(b.hasNext())
        {
            System.out.println(b.next());
        }

    }
}
