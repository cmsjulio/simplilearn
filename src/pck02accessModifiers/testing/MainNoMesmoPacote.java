package pck02accessModifiers.testing;

// no mesmo pacote o no modifier funciona, importando o método .displayDefault().
public class MainNoMesmoPacote {
    public static void main(String[] args) {
        Test t = new Test();
        t.displayDefault();
        t.displayPublic();
        t.displayProtected();
    }
}
