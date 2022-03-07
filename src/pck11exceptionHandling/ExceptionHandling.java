package pck11exceptionHandling;

/*

  whenever you have to handle the exceptions, the way Java provides us to do so is by using the try/catch block.

  try/catch block is a bunch of syntax we have to follow to handle different types of exceptions in our code.

  syntax:

  try {
    code that might throw an exception. suspicious or not suspicious code.
    }
  catch (ExceptionType name) {
    specify the type of exception we are aiming to deal with; we don't have to list them all.
  }
  catch (ExceptionType name) {
  }

  --

  it is also possible to catch all exceptions in the same handler -- as long as the logic of them is the same:

  try {
    code
    }
  catch (IOException | SQLException ex){
    logger.log(ex);
    throw ex;
  }

  --

  finally: used for cleanup operations -- the runtime will always execute statements inside the finally blocks.
           used for closing database connections etc.

   try {
      code
      }
   catch (ExceptionName name){
      treatment
      }
   finally {
      cleanup
   }

 */

public class ExceptionHandling {
  public static void main(String[] args) {
    WriterHelper helper = new WriterHelper();
    helper.writeList();
  }
}
