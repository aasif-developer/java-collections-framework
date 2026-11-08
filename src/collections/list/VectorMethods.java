package collections.list;
import java.util.*;
public class VectorMethods {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        //1. add elements
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        System.out.println(v);

        //2. remove element
        v.remove(2);
        System.out.println(v);

        v.remove(Integer.valueOf(50));
        System.out.println(v);

        //3. get element
        System.out.println(v.get(1));

        //4. set element
        v.set(1, 100);
        System.out.println(v);

        //5. add element at specific index
        v.add(1, 200);
        System.out.println(v);

        //6. check element
        System.out.println(v.contains(100));

        //7. get size
        System.out.println(v.size());

        //8. check if empty
        System.out.println(v.isEmpty());

        //9. copy Vector
        Vector<Integer> v1 = new Vector<>(v);
        System.out.println(v1);

        //10. remove all elements
        v.clear();
        System.out.println(v);
    }
}
