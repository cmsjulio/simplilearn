package pck11exceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class WriterHelper {
  public void writeList(){
    try {
      List<Integer> list = new ArrayList<>(10);
      list.add(1);

      System.out.println("Entering" + " try statement.");
      Integer a = list.get(1); //index 1 has nothing inside of it
      System.out.println("accessing the first element: " +a);
  }
    catch (IndexOutOfBoundsException e){
      System.err.println("Caught IndexOutOfBoundsException: " + e.getMessage());

    }
    finally {
      System.out.println("This will always be executed.");
    }
    }

    // o código inicia, imprime o Entering try statement, tenta acessar o index 1, dá erro,
    // encontra o tipo de erro nos catches, roda o código do catch, depois finally.
}
