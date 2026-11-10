package practice;
import java.util.*;
import java.util.ArrayList;
public class CollectionsRevise {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();

        List<String> li1=new LinkedList<>();

        Vector<Float> li2 = new Vector<>();

        Stack<Double> li3=new Stack<>();

        li.add(10);
        li.add(20);
        System.out.println("ArrayList :" +li);

        li1.add("AASIF");
        li1.add("DSA");
        li1.add("MASTER");
        li1.add("AIML");
        System.out.println(li1.subList(0,3));
        System.out.println("LinkedList :"+li1);

        li2.add(30.098f);
        System.out.println(li2.get(0));
        System.out.println("Vector :"+li2);

        li3.add(40.987654321);
        li3.add(30.57494940494);
        System.out.println(li3.peek());
        System.out.println(li3.isEmpty());
        System.out.println("Stack :"+li3);





    }
}
