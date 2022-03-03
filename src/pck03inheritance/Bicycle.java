package pck03inheritance;

public class Bicycle {

    // protected = acessível à subclasse.
    protected int gear;
    protected int speed;

    public Bicycle (int startSpeed, int startGear){
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public void setGear(int newGearValue){
        this.gear = newGearValue;
    }

//    public void setSpeed(int newSpeedValue){
//        this.speed = newSpeedValue;
//    }

    public void applyBreak(int decrement){
        this.speed-=decrement;
    }

    public void speedUp(int increment){
        this.speed+=increment;
    }

    // apenas aqui na classe;
    private void metodoPrivado(){
        System.out.println("Método privado.");
    }

    void metodoDefault(){
        System.out.println("Chamando método privado dentro da classe:");
        metodoPrivado();
    }
}
