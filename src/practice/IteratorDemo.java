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
        - iterator()
        - hasNext()
        - next()
        - remove()

        */


        //============================================================
        // CREATING AN ARRAYLIST
        //============================================================

        ArrayList<String> names = new ArrayList<>();


        // Adding elements

        names.add("Aasif");
        names.add("Rahul");
        names.add("John");


        // Displaying the original ArrayList

        System.out.println("Original List : " + names);
        System.out.println();



        //============================================================
        // CREATING AN ITERATOR
        //============================================================

        // iterator() returns an Iterator object
        // which is used to traverse the Collection.

        Iterator<String> iterator = names.iterator();



        //============================================================
        // hasNext()
        //============================================================

        // Checks whether another element is available.

        System.out.println("Has Next Element : " + iterator.hasNext());
        System.out.println();



        //============================================================
        // next()
        //============================================================

        // next() returns the next element and
        // moves the Iterator to the next position.

        System.out.println("Traversing using Iterator");

        while (iterator.hasNext()) {

            String name = iterator.next();

            System.out.println("Current Element : " + name);

        }

        System.out.println();



        //============================================================
        // remove()
        //============================================================

        // remove() removes the last element
        // returned by next().

        // It is the safe way to remove elements
        // while traversing a Collection.

        Iterator<String> removeIterator = names.iterator();

        while (removeIterator.hasNext()) {

            String name = removeIterator.next();

            if (name.equals("Rahul")) {

                removeIterator.remove();

            }

        }

        System.out.println("After Removing Rahul : " + names);
        System.out.println();



        //============================================================
        // hasNext() AFTER TRAVERSAL
        //============================================================

        System.out.println("Has Next Element : " + removeIterator.hasNext());

    }
}