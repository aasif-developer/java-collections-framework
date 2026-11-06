package practice;
import java.util.*;
public class CollectionsBasics {

    public static void main(String[] args) {
        System.out.println("1.LIST - Insertion order , Allow Duplicates");
        System.out.println("1.1 ArrayList");
        List<Integer> li = new ArrayList<>(); //initialization
        li.add(10);  //adding elements
        li.add(20);
        li.add(30);
        System.out.println(li);
        Iterator<Integer> It = li.iterator();  //Iteration of elements
        while(It.hasNext())
        {
            System.out.println(It.next());
        }
        li.remove(1);//Removing of element
        li.remove(Integer.valueOf(10));
        System.out.println(li);

        System.out.println("1.2 LinkedList");
        List<String> str=new LinkedList<>();
        str.add("AASIF");
        str.add("JAVA");
        str.add("DSA");
        System.out.println(str);
        for(String name : str)
        {
            System.out.println(name);
        }

    }
}
