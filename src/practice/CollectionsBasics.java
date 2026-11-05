package practice;
import java.util.*;
public class CollectionsBasics {

    public static void main(String[] args) {
        System.out.println("1.LIST - Insertion order , Allow Duplicates");
        System.out.println("1.1 ArrayList");
        List<Integer> li = new ArrayList<>(); //initialization
        li.add(10);  //adding elements
        li.add(20);
        System.out.println(li);
        Iterator<Integer> It = li.iterator();  //Iteration of elements
        while(It.hasNext())
        {
            System.out.println(It.next());
        }
        li.remove(1); //Removing of element
        System.out.println(li);
    }
}
