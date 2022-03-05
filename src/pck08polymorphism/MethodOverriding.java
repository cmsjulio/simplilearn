package pck08polymorphism;

/*

    same signature of the method being used again and again in the code, but in a different way.

    method overriding is used to get rid of the concept of inheritance;
    you can only use method overriding (@Override) in subclasses;

    if a superclass defined a method and the subclass again try to define a method with an exact same signature (its name),
    then we have method overriding (@Override).

    there are some rules to follow:

                                |   superclass instance method      |         superclass static method      |
    subclass instance method    |             overrides             |       generates compile-time error    |
    subclass static method      |    generates compile-time error   |                  hides                |

    instance method: normal methods (without static keyword)

    override -> when you call the method, you will get the subclass's one.
    static method -> belong to the class, not to the object.

    a static method cannot be overridden by declaring an instance method in the subclass; it results a compile-time error.

    if a static method is overridden by a subclass static method, the superclass's static method gets hidden.

 */

public class MethodOverriding {
    public static void main(String[] args) {
        BicycleOverriding bicycleOverriding = new BicycleOverriding(1, 10);
        System.out.println("Bike's gear is: " + bicycleOverriding.gear);
        System.out.println("Bike's speed is: " + bicycleOverriding.speed);
        bicycleOverriding.applyBreak(1);
        System.out.println("Bike's speed after breaking is: " + bicycleOverriding.speed);

        // dynamica binding concept: declares a superclass (left side), implements the subclass (right side).
        BicycleOverriding mountainBike = new MountainBikeOverriding(50,50,3);
        System.out.println("MB's gear is: " + mountainBike.gear);
        System.out.println("MB's speed is: " + mountainBike.speed);
        mountainBike.applyBreak(1);
        System.out.println("MB's speed after break is: " + mountainBike.speed);
        mountainBike.speedUp(10);
        System.out.println("MB's speed after speedup is: " + mountainBike.speed);
    }
}
