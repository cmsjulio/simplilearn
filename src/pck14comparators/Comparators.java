package pck14comparators;

/*

  criado para permitir comparações múltiplas para um mesmo objeto: alfabetica por nome, por idade, por id etc.

 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparators {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();

    Student john = new Student(3, "John", 18);
    Student jane = new Student(1, "Jane", 21);
    Student tom = new Student(2, "Tom", 20);

    list.add(john);
    list.add(jane);
    list.add(tom);

    Collections.sort(list);
    System.out.println("List sorted is:");
    list.forEach(student -> System.out.println(student.getName()));

    // it should print the list by rollnumber order.


    Collections.sort(list, new AgeComparator());
    System.out.println("List sorted by age is:");
    list.forEach(student -> System.out.println(student.getName()));


  }
}
