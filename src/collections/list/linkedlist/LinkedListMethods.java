package collections.list.linkedlist;

import java.util.*;

public class LinkedListMethods {
    public static void main(String[] args) {

        LinkedList<Integer> al = new LinkedList<>();

        al.add(10);     //1. add
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);

        al.remove(2);   //2. remove
        System.out.println(al);

        al.remove(Integer.valueOf(50));
        System.out.println(al);

        System.out.println(al.get(1));  //3. get

        al.set(2, 100);  //4. set
        System.out.println(al);

        LinkedList<Integer> al1 = new LinkedList<>(al);   //5. copy
        System.out.println(al1);

        al1.add(80);
        al1.add(90);
        al1.add(110);
        System.out.println(al1);

        LinkedList<Integer> al2 = new LinkedList<>();
        al2.add(5);
        al2.add(7);
        al2.addAll(al1);
        System.out.println(al2);    //6. addAll

        System.out.println(al2.indexOf(100)); //7. indexOf

        al2.add(100);
        System.out.println(al2);

        System.out.println(al2.lastIndexOf(100));   //8. lastIndexOf

        System.out.println(al2.subList(1, 5));   //9. subList
    }
}