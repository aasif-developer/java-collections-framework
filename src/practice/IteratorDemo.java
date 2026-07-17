package practice;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        /*============================================================
          ITERATOR
        ============================================================

        An Iterator is used to traverse (iterate through)
        the elements of a Collection one by one.

        It works with all Collection classes such as
        ArrayList, LinkedList, HashSet, etc.

        Iterator provides methods like:
        - hasNext()
        - next()
        - remove()

        */

        // Creating an ArrayList

        ArrayList<String> names = new ArrayList<>();


        // Adding elements to the ArrayList

        names.add("Aasif");
        names.add("Rahul");
        names.add("John");


        /*============================================================
          CREATING AN ITERATOR
        ============================================================

        iterator() returns an Iterator object.

        This object is used to traverse the Collection.

        */

        Iterator<String> iterator = names.iterator();


        /*============================================================
          TRAVERSING USING ITERATOR
        ============================================================

        hasNext() checks whether another element is present.

        next() returns the next element and moves the
        Iterator to the next position.

        */

        while (iterator.hasNext()) {

            String name = iterator.next();

            System.out.println(name);

        }

    }
}