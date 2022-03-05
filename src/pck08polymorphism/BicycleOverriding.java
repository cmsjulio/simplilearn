package pck08polymorphism;

class BicycleOverriding {
    protected int gear;
    protected int speed;

    public BicycleOverriding (int startGear, int startSpeed){
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void applyBreak(int decrement){
        this.speed = this.speed-decrement;
    }

    public void speedUp(int increment){
        this.speed = this.speed+increment;
    }
}
