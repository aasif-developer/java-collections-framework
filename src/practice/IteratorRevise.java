package practice;
import java.util.*;
public class IteratorRevise {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();

        li.add(10);
        li.add(20);
        li.add(30);
        System.out.println("THE ARRAY CONTAINS :" + li);

        Iterator<Integer> it=li.iterator();

        while(it.hasNext())
        {

            Integer abc = it.next();
            System.out.println(abc);
        }
        Set<String> name = new HashSet<>();
        name.add("AASIF");
        name.add("ABC");
        name.add("XYZ");
        name.add("AASIF");
        System.out.println(name);
        System.out.println("1.USING ITERATOR");
        Iterator<String> it1 = name.iterator();
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }

        System.out.println("2.USING ENHANCED FOR");
        for(String names : name)
        {
            System.out.println(names);
        }
        for(Integer it2 : li)
        {
            System.out.println(it2);
        }
    }
}