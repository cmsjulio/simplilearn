package pck11exceptionHandling;

public class NestedTryCatch {
  public static void main(String[] args) {

    /*
      as exceções vão sendo lançadas (throw) e capturadas (catch) pelos blocos exteriores.
     */

    try{
      //block 1
      try {
        //block2
        try {
          //block3
          int arr[] = {1, 2, 3, 4};

          System.out.println(arr[10]);

        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("ArrayIndexOutOfBounds Exception in Block 3.");
          throw e;
        }
      } catch (ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutOfBounds Exception in Block 2.");
        throw e;
        }
      } catch (ArrayIndexOutOfBoundsException e4) {
      System.out.println("ArrayIndexOutOfBoundsException in Block 1.");
//      throw e4;
  }
  }
}
