package pck15enumeration;

/*

  to define variables that may remain constant for ever: months of the year, name of flowers, name of the seasons.

  type safe variables: not integer or strings, but enum types: a completely new data type.
  by default, they are constant.

  defining:

  public enum Day{
    SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO, DOMINGO
  }

  The values are CAPS by default.
 */

public class Enumeration {
  public static void main(String[] args) {
    Color c1 = Color.RED;

    System.out.println("Red Enum name: " + c1.name());
    System.out.println("Red Enum value: " + c1.getValue());

    for (Color color : Color.values()){
      System.out.println("Enum values: " + color.getValue());
    }

    for (Color color : Color.values()){
      System.out.println("Enum names: " + color.name());
    }
  }
}
