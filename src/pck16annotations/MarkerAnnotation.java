package pck16annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //when it is going to be excecuted/active/evaluated
@Target(ElementType.TYPE)//where it is going to be applied: class, method, member variable etc.
public @interface MarkerAnnotation {
}
