package collections.arraylist;
import java.util.*;
import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        System.out.println(al.getClass().getName());
        al.add("AASIF");
        al.add("JAVA");
        al.add("DEVELOPER");

        System.out.println(al);
        System.out.println();
        String[] arr = al.toArray(new String[0]);
        System.out.println(arr.getClass().getName());
        System.out.println(Arrays.toString(arr));
        System.out.println();
        //USING INTEGER ARRAY
        ArrayList<Integer> alt = new ArrayList<>();
        System.out.println(al.getClass().getName());
        alt.add(1);
        alt.add(2);
        alt.add(3);

        System.out.println(alt);
        System.out.println();
        Integer[] arr1 = alt.toArray(new Integer[0]);
        System.out.println(arr1.getClass().getName());
        System.out.println(Arrays.toString(arr1));

    }
}
