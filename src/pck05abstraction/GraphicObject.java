package pck05abstraction;

public abstract class GraphicObject {
    int x,y;
    // these variables are accessible by the subclasses;

    GraphicObject (){
        System.out.println("Método construtor da classe abstrata GraphicObject.");
        // o construtor da superclasse é instanciado quando a subclasse é instanciada.
    }

    void moveTo(int newX, int newY){
        System.out.println("move to x: " + x + ", and y: " + y);
    }

    abstract void draw();
    abstract void resize();

    //notice that we have both abstract and non abstract methods.
}
