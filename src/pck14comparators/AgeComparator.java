package pck14comparators;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

  @Override
  public int compare(Student student1, Student student2) { // the name is compare, rather than compareTo
    if (student1.getAge() < student2.getAge()) {
      return -1;
    }
    //younger should come first.
    if (student1.getAge() > student2.getAge()) {
      return 1;
    } else {
      return 0;
    }
  }
}
