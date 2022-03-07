package pck16annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) //aplicável apenas a método, se aplicado a uma classe, retorna erro.
public @interface MyCustomAnnotation {
  int value();
}
