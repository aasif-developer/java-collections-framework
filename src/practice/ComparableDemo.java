package practice;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    int id;

    // Constructor

    Student(int id) {

        this.id = id;

    }


    /*============================================================
      compareTo()
    ============================================================

    compareTo() defines the natural sorting order
    of objects.

    return < 0  -> Current object comes before other object
    return = 0  -> Both objects are equal
    return > 0  -> Current object comes after other object

    */

    @Override
    public int compareTo(Student other) {

        return this.id - other.id;

    }


    // Display Student ID

    @Override
    public String toString() {

        return String.valueOf(id);

    }

}

public class ComparableDemo {

    public static void main(String[] args) {

        /*============================================================
          COMPARABLE
        ============================================================

        Comparable is an interface used to define
        the natural sorting order of objects.

        It contains one method:

        compareTo()

        A class implements Comparable and overrides
        compareTo() to define how its objects should
        be sorted.

        Collections.sort() internally calls compareTo()
        to sort the objects.

        */


        //============================================================
        // CREATING AN ARRAYLIST
        //============================================================

        ArrayList<Student> students = new ArrayList<>();


        // Adding Student objects

        students.add(new Student(103));
        students.add(new Student(101));
        students.add(new Student(102));


        // Displaying the original list

        System.out.println("Before Sorting : " + students);
        System.out.println();


        //============================================================
        // SORTING USING COMPARABLE
        //============================================================

        Collections.sort(students);


        // Displaying the sorted list

        System.out.println("After Sorting : " + students);

    }
}