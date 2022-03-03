package pck03inheritance;

public class MountainBike extends Bicycle {
    public int seatHeigth;

    // a classe MountainBike precisa iniciar a classe base Bicycle.
    // assim, em seu construtor, é preciso haver parâmetros da super classe.
    // esses parâmetros são passados à superclasse por meio do método super, conforme construtor da superclasse.

    // o método SUPER deve ser o primeiro statement no construtor da subclasse.

    // a subclasse tem acesso a tudo da superclasse.

    public MountainBike(int startHeight,
                        int startSpeed,
                        int startGear) {
        super(startSpeed, startGear);
        this.seatHeigth = startHeight;
    }

    public void setSeatHeigth(int newHeigthValue) {
        this.seatHeigth = newHeigthValue;
    }


}
