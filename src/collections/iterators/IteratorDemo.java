package collections.iterators;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {

    public static void main(String[] args) {

        // Iterator is used to traverse a Collection.

        // Creating a Collection

        ArrayList<String> names = new ArrayList<>();

        // Adding elements

        names.add("Aasif");
        names.add("Rahul");
        names.add("John");

        // Creating an Iterator
        // Syntax:
        // Iterator<DataType> iterator = collection.iterator();

        Iterator<String> iterator = names.iterator();

        // Traversing the Collection
        // hasNext() -> Checks if next element exists.
        // next() -> Returns the next element.
        System.out.println("1.ITERATING USING ITERABLE INTERFACE");
        while (iterator.hasNext()) {

            String name = iterator.next();

            System.out.println(name);
        }
            System.out.println("2.ITERATING USING ENHANCED FOR LOOP(for each loop)");
            for(String name1 : names)
            {
                System.out.println(name1);
            }

        }

    }
