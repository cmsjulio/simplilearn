package pck13comparables;

/*

  the need for comparison comes from a requirement for whenever we need to sort our collections.

  for sorting, there is a method called Collections.sort(list)

  for custom objects, Java does not know how to handle that. Primitives types are dealt with pretty well, not custom ones.

  Comparable interface exists to solve that exact problem.

  public interface Comparable<T>{
    public int compareTo(T o);
    }



 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparables {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<Student>();

    Student john = new Student(3, "John", 21);
    Student jane = new Student(1, "Jane", 18);
    Student tom = new Student(2, "Tom", 20);

    list.add(john);
    list.add(jane);
    list.add(tom);

    Collections.sort(list);
    System.out.println("List sorted is:");
    list.forEach(student -> System.out.println(student.getName()));

    // it should print the list by rollnumber order.



  }
}
