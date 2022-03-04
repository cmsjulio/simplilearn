package pck07multipleInheritance;

class MoutainBikeMultInt extends TwoWheeler implements BicycleMultInt, VehicleMultInt {
    // we cannot extend from multiple concrete classes, one at most;
    // we can implement multiple interfaces;

    private int seatHeight;
    private int gear;
    private int speed;

    public MoutainBikeMultInt (int seatHeight, int gear, int speed){
        this.seatHeight = seatHeight;
        this.gear = gear;
        this.speed = speed;
    }

    //implementando a segunda interface implementada;
    @Override
    public void canDrive(){
        System.out.println("Moutain bike can be driven.");
    }

    @Override
    public void applyBreak(int decrement){
        this.speed = speed - decrement;
    }

    @Override
    public void speedUp(int increment){
        this.speed = speed + increment;
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
