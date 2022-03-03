package pck03inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 20, 1);

        System.out.println("Gear is: " + mountainBike.gear);
        System.out.println("Seat heigth is: " + mountainBike.seatHeigth);
        System.out.println("Bike speed is: " + mountainBike.speed);

        mountainBike.applyBreak(1);

        System.out.println("Speed after breaking is: " + mountainBike.speed);


        Bicycle bicycle = new Bicycle(10, 1);
        bicycle.metodoDefault();
    }
}
