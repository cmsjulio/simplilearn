package pck10exceptionsInJava;

// whenever you create an exception, it is by deafult a checked exception.
class MyException extends Exception{

  MyException(){}

  MyException(String str){super(str);}

}
