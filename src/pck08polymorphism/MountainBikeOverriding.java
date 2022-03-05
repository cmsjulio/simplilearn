package pck08polymorphism;

public class MountainBikeOverriding extends BicycleOverriding{
    public int seatHeight;

    public MountainBikeOverriding(int startHeight, int startSpeed, int startGear){
        super(startGear, startSpeed);
        this.seatHeight = startHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public void setGear(int newGear){
        this.gear = newGear+2;
    }

    @Override
    public void applyBreak(int decrement){
        this.speed = this.speed - decrement - 10;
    }

    @Override
    public void speedUp(int increment){
        this.speed = this.speed + increment + 10;
    }
}
