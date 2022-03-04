package pck05abstraction;

/*

    when you want to hide details of a particular object to the outside world;
    ex.: when you git the gas in a car, it moves forward, even tho there is much more going on under the hood;
    abstract serves us as a way to hide details from the user -- thus providing a simpler interface.

    -

    abstract is the keyword that can be used in front of a class or a method;
    when in front of a class, the whole class becomes abstract.
    abstract classes cannot be instanciated (invoked) but yet they can be subclassed.
    when you add the abstract keyword in front of a method, the method is only declared withou an implementation, you only declare the method.
    is the responsibility of the child class to implement the abstract methods.

    we CANNOT extend from MORE THAN ONE superclass.

 */

public class Abstraction {
    public static void main(String[] args) {
        GraphicObject circle = new Circle();
        circle.draw();
        circle.resize();
        // circle declarado com classe abstrata (superclasse) e depois implementado com new Circle();

        //mesmo quando declaro o objeto Rectangle no lado esquerdo, a superclasse é instanciada (ver print output)
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
        // rectangle declarado com classe abstrata (superclasse) e depois implementado com new Rectangle();

        // os métodos são chamados conforme a classe que IMPLEMENTA a anteriormente declarada no lado esquerdo.
    }
}
