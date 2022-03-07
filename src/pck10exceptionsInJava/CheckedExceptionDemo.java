package pck10exceptionsInJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {
  public static void main(String[] args) throws MyException { //let the whoever caller is calling it deals with the exception
//    FileReader file = new FileReader("/home/wmancciny/file2");
//    BufferedReader fileInput = new BufferedReader(file);
//
//    // Print first 3 lines of file
//    for (int counter = 0 ; counter < 0; counter++)
//      System.out.println(fileInput.readLine());
//    fileInput.close();

    throw new MyException(); //to throw MyException

  }
}
