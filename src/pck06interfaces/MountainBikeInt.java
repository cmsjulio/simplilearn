package pck06interfaces;

public class MountainBikeInt implements BicycleInt{

    private int seatHeight;
    private int gear;
    private int speed;

    public MountainBikeInt (int seatHeight, int gear, int speed){
        this.seatHeight = seatHeight;
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void applyBreak(int decrement){
        this.speed-=decrement;
    }

    @Override
    public void speedUp(int increment){
        this.speed+=increment;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
