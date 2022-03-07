package pck16annotations;

import java.lang.reflect.Method;

public class MyClass {
  @MyCustomAnnotation(value = 10)
  public void sayHello(){
    System.out.println("My custom annotation.");
  }

  public static void main(String[] args) throws Exception{
    MyClass myClass = new MyClass();
    Method methodVal = myClass.getClass().getMethod("sayHello");
    // we do like the above to call an method derived from an annotation;
    // getClass and getMethod(methodName) output sent to a Method class.

    MyCustomAnnotation myCustomAnnotation = methodVal.getAnnotation(MyCustomAnnotation.class);
    //getting annotation from Method obtained;

    System.out.println("value is: " + myCustomAnnotation.value());
    //printing its value;

  }
}
