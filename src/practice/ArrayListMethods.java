package practice;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        //CREATION OF ARRAY LIST
        List<Integer> num = new ArrayList<>();
        System.out.println("1.ADDING OF ELEMENTS TO THE ARRAY LIST");
        num.add(10);
        num.add(20);
        num.add(30);
        System.out.println("THE ARRAY ELEMENTS ARE :"+ num+"\n");


        System.out.println("2.ADDING ELEMENTS ON A PARTICULAR INDEX");
        num.add(3,40);
        num.add(2,70);
        System.out.println("THE ARRAY ELEMENTS ARE :"+ num +"\n");


        System.out.println("3.RETURNING THE INDEX OF THE ELEMENT");
        System.out.println("3RD ELEMENT OF ARRAY :"+num.get(2) +"\n");


        System.out.println("4.REPLACING OF ELEMENTS ");
        num.set(2,25);
        System.out.println("THE ARRAY ELEMENTS ARE :"+ num +"\n");


        System.out.println("5.REMOVING OF ELEMENTS USING OBJECT");
        num.remove(Integer.valueOf(20));
        System.out.println("THE ARRAY ELEMENTS ARE :"+ num +"\n");


        System.out.println("6.RETURNING THE SIZE OF THE ARRAY LIST");
        System.out.println("THE SIZE OF ARRAY LIST IS :"+ num.size() +"\n");


        System.out.println("7.CHECKING WHETHER THE ELEMENT EXISTS");
        System.out.println("DOES 30 EXIST ? :"+ num.contains(30) +"\n");


        System.out.println("8.CHECKING WHETHER THE ARRAY LIST IS EMPTY");
        System.out.println("IS THE ARRAY LIST EMPTY ? :"+ num.isEmpty() +"\n");


        System.out.println("9.RETURNING THE FIRST OCCURRENCE OF AN ELEMENT");
        System.out.println("INDEX OF 30 IS :"+ num.indexOf(30) +"\n");


        System.out.println("10.RETURNING THE LAST OCCURRENCE OF AN ELEMENT");
        num.add(30);
        System.out.println("THE ARRAY ELEMENTS ARE :"+ num);
        System.out.println("LAST INDEX OF 30 IS :"+ num.lastIndexOf(30) +"\n");


        System.out.println("11.TRAVERSING USING FOR LOOP");
        for(int i = 0; i < num.size(); i++){
            System.out.print(num.get(i)+" ");
        }
        System.out.println("\n");


        System.out.println("12.TRAVERSING USING ENHANCED FOR LOOP");
        for(Integer element : num){
            System.out.print(element+" ");
        }
        System.out.println("\n");


        System.out.println("13.TRAVERSING USING ITERATOR");
        Iterator<Integer> iterator = num.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println("\n");


        System.out.println("14.CONVERTING ARRAY LIST TO ARRAY");
        Object[] array = num.toArray();
        System.out.println(Arrays.toString(array) +"\n");


        System.out.println("15.SORTING THE ARRAY LIST");
        Collections.sort(num);
        System.out.println("THE ARRAY ELEMENTS ARE :"+ num +"\n");


        System.out.println("16.REVERSING THE ARRAY LIST");
        Collections.reverse(num);
        System.out.println("THE ARRAY ELEMENTS ARE :"+ num +"\n");


        System.out.println("17.SHUFFLING THE ARRAY LIST");
        Collections.shuffle(num);
        System.out.println("THE ARRAY ELEMENTS ARE :"+ num +"\n");


        System.out.println("18.RETURNING THE LARGEST ELEMENT");
        System.out.println("MAXIMUM ELEMENT IS :"+ Collections.max(num) +"\n");


        System.out.println("19.RETURNING THE SMALLEST ELEMENT");
        System.out.println("MINIMUM ELEMENT IS :"+ Collections.min(num) +"\n");


        System.out.println("20.CLEARING THE ARRAY LIST");
        num.clear();
        System.out.println("THE ARRAY ELEMENTS ARE :"+ num +"\n");


        System.out.println("21.CHECKING WHETHER THE ARRAY LIST IS EMPTY AFTER CLEAR");
        System.out.println("IS THE ARRAY LIST EMPTY ? :"+ num.isEmpty() +"\n");
    }
}
