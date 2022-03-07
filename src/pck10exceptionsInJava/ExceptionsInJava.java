package pck10exceptionsInJava;

/*

  developers make mistakes: we do create bugs and errors when we write code;

  to handle these kinds of exceptions and errors, every programming language provides their own exceptions and errors framework
  to help spotting those errors and fixing those errors.

  java also provide its own exception framework.

  the whole exception handling framework hierarchy starts with the class Throwable.
    Throwable deals and handles with all kinds of exceptions.

                                              Throwable
                 Exceptions                                                   Errors
           IO-Exception:                                                JVM Error
when somethings goes wrong with file
writing/reading/handling operations                                     Memory

           SQL-Exception:                                               Framework
talking to the database, writing SQL
queries and something goes wrong.

           ClassNotFound:
class not found in the runtime, or at
the time the class is being loade in the
JVM.

           Run-Time:
           Arithmetic, NumberFormat etc.

           ----------------------------

           Exception: type of problem from which the program can be recovered. focus of developer. developer should handle
           them properly. Responsibility of the developer.

           Errors: developer does not have any control.

           ----------------------------

           Runtime exceptions   - also called UNCHECKED exceptions.
                                  we do not have to explicitly specify them in our program.

           IO/SQL/ClassNotFound - also called CHECKED exceptions.
                                  Java will force us to handle these. It wont compile unless you handle it.

           -----------------------------

           You can also create your own custom exception by extending the Exception class.

 */

public class ExceptionsInJava {
  public static void main(String[] args) {
//    int data = 100/0; // divide by 0. Arithmetic exception.
//    System.out.println(data);

    String a = null; // null value; Nullpointer exception.
    System.out.println(a.charAt(0));
  }
}
