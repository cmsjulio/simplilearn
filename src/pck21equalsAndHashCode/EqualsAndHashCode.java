package pck21equalsAndHashCode;

/*

  one of the most important concepts in Java, asked about frequently in job interviews.

  to understand it, we must first understand the Object class in Java.

    Object is a class, which is the super super class of ANY object we create in Java. Every single class is a subclass of Object.

    Object class defines the Equals method:   which indicates whether some object is "equal to" that one.
                  and also a HashCode method: which defines a hash code value for the object.

                  these methods have their concrete implementations available inside the Object class.

                  HashSet, e.g., maintains uniqueness automatically due to Equals method implementation.
                  in primitive types, you can maintain uniqueness easily;
                  what about Student objects?
                  Java does not know how to perform equality of two Student objects, as they are custom objects.

                  That is when Equals and HashCodes come into picture:

                  the contract is: whenever we are creating our own custom objects and we have a need to perform equality
                    in those objects, we MUST @Override the Equals method in our own class. If we dont do that, the Students,
                    e.g., objects will be compared based on reference rather than based on the actual object values.

                  Whenver we @Override Equals, we must also @Override the HashCode method, as HashCode is also used in
                    searching colletions.

 */

public class EqualsAndHashCode {
  public static void main(String[] args) {
    // retorna false se não fizer pelo menos o @Override do Equals.
    Student john1 = new Student(1, "John", "23 East, California");
    Student john2 = new Student(1, "John", "23 East, California");

    System.out.println(john1.equals(john2)); // we get false without @Overriding the Student object.
    // the memory location of the values are different, even though the objects are exactly the same.

    // mesmo rollnumber, nomes e endereços diferentes (teste para apenas @Override do Equals);
    Student john3 = new Student(3, "John3", "233 East, California");
    Student john4 = new Student(3, "John4", "234 East, California");

    System.out.println(john3.equals(john4));


  }
}
