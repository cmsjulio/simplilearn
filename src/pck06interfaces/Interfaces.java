package pck06interfaces;

/*

    imagine if all the cars manufacturers were creating a different way of driving a car: one has a steering, others dont; different kind of doors, etc.
    they would not be working in a similar contract, thus not respecting a single interface, which creates a poor user experience.
    thats the basic need for the concept of interfaces: interfaces are like contracts.
    with an interface, the programmers are agreeing with the same contract.
    interfaces define the specifications on how a class would act: they define the contract.

    interaces:
        can only contain:
            contants,
            method signatures,
            default methods,
            static methods,
            nested types.

        you cannot write something concrete in terms of the behavior (methods) of the interface.

        interfaces cannot be instantiated, only implemented by classes or extended by other interfaces.
 */

public class Interfaces {
    public static void main(String[] args) {
        MountainBikeInt mountainBikeInt = new MountainBikeInt(20,1,10);

        System.out.println("Gear is: " + mountainBikeInt.getGear());
        System.out.println("Seat height is: " + mountainBikeInt.getSeatHeight());
        System.out.println("Bike speed is: " + mountainBikeInt.getSpeed());

        mountainBikeInt.applyBreak(1);

        System.out.println("Speed after applying break is: " + mountainBikeInt.getSpeed());

        mountainBikeInt.speedUp(10);

        System.out.println("Speed after speeding ups is: " + mountainBikeInt.getSpeed());
    }
}
