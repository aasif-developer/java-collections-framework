package practice;
import java.util.*;
public class NormalArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(Arrays.toString(arr));
        System.out.println("THE LENGTH OF THE ARRAY IS : " +arr.length);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("THE ELEMENT ON THE INDEX "+ i + " is : " + arr[i]);
        }
}}
