package practice;
import java.util.ArrayList;
public class Generics_Wrapper
{
    public static void main(String[] args) {

        /*============================================================
          1. GENERICS
        ============================================================

        Generics allow us to specify what type of data
        a Collection can store.

        <Integer> is called a Generic.

        It provides type safety by allowing only
        Integer objects to be stored in the ArrayList.

        */

        ArrayList<Integer> numbers = new ArrayList<>();

        /*============================================================
          2. WRAPPER CLASS
        ============================================================

        A Wrapper Class is a class that wraps a primitive
        data type into an object.

        Integer is the Wrapper Class for int.

        Collections store only objects, so Wrapper Classes
        are used instead of primitive data types.

        */

        Integer num = 100;

        /*============================================================
          3. AUTOBOXING
        ============================================================

        Autoboxing is the automatic conversion of a
        primitive data type into its corresponding
        Wrapper Class object.

        Here, 10 is a primitive int.

        Java automatically converts:

        numbers.add(10);

        into

        numbers.add(Integer.valueOf(10));

        */

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        /*============================================================
          4. UNBOXING
        ============================================================

        Unboxing is the automatic conversion of a
        Wrapper Class object into its corresponding
        primitive data type.

        numbers.get(0) returns an Integer object.

        Java automatically converts:

        int first = numbers.get(0);

        into

        int first = numbers.get(0).intValue();

        */

        int first = numbers.get(0);


        System.out.println("Wrapper Object : " + num);
        System.out.println("First Element  : " + first);
        System.out.println("ArrayList      : " + numbers);

    }
}