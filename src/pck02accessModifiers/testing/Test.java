package pck02accessModifiers.testing;

// no modifiers
//class Test { //não funciona assim, com no modifier
public class Test{
//    void display(){ // não funciona com no modifier, tem que ser publico para ter acesso noutro pacote.
    public void displayPublic(){
        System.out.println("public Hello world.");
    }

    void displayDefault(){
        System.out.println("default Hello world.");
    }

    protected void displayProtected(){
        System.out.println("protected Hello world.");
    }

    private void displayPrivate(){
        System.out.println("private Hello world.");
    }
}
