package collections.arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);     //add
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        al.remove(2);   //remove
        System.out.println(al);
        al.remove(Integer.valueOf(50));
        System.out.println(al);
        System.out.println(al.get(1));  //get
        System.out.println(al.set(1,100));  //set


    }
}