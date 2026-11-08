package collections.list;
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
        al.set(2,100);  //set
        System.out.println(al);
        ArrayList<Integer> al1 = new ArrayList<>(al);   //copy
        System.out.println(al1);
        al1.add(80);
        al1.add(90);
        al1.add(110);
        System.out.println(al1);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(5);
        al2.add(7);
        al2.addAll(al1);
        System.out.println(al2);    //addAll
        System.out.println(al2.indexOf(100)); //indexOf
        al2.add(100);
        System.out.println(al2);
        System.out.println(al2.lastIndexOf(100));   //lastIndexOf
        System.out.println(al2.subList(1,5));   //subList

    }
}