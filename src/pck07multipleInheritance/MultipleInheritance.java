package pck07multipleInheritance;

/*

    one child cannot have two parent classes in java: this is called the diamond problem;

    a subclass C that would extend two superclasses A and B would not know which route to take to get to an above of all superclass D.
    that is the diamond problem.
                D
             A     B
                C

    interfaces are used to solve this.

 */

public class MultipleInheritance {
    public static void main(String[] args) {
        MoutainBikeMultInt moutainBikeMultInt = new MoutainBikeMultInt(20,1,20);

        System.out.println("Gear is: " + moutainBikeMultInt.getGear());
        System.out.println("Seat height is: " + moutainBikeMultInt.getSeatHeight());
        System.out.println("Speed is: " + moutainBikeMultInt.getSpeed());

        moutainBikeMultInt.applyBreak(1);

        System.out.println("Speed after break is: " + moutainBikeMultInt.getSpeed());

        moutainBikeMultInt.speedUp(10);

        System.out.println("Speed after speedUp is: " + moutainBikeMultInt.getSpeed());

        moutainBikeMultInt.canDrive();

        moutainBikeMultInt.canRotateTwoWheels();
    }
}
