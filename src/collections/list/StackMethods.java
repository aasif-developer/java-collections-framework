package collections.list;
import java.util.*;
public class StackMethods {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());  //1. check if empty

        stack.push(10);       //2. add element
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);

        System.out.println(stack.peek());     //3. return top element

        System.out.println(stack.search(20)); //4. search element

        // METHODS THAT CAN CAUSE EXCEPTION IF STACK IS EMPTY

        System.out.println(stack.pop());      //5. remove and return top element

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());
    }
}
