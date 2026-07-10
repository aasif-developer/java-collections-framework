package collections.introduction;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        numbers.remove(2);System.out.println(numbers);

    }
}
