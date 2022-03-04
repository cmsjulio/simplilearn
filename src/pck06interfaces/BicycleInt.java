package pck06interfaces;

interface BicycleInt {

    // you also can only have contants, not variables;
    // int x; <- this wont be accepted; they would have to be public static final.

    // no concrete implementation in the superclass for interfaces.

    // we can only declare methods, not define them.
    // in abstract objects, we could do define concrete methods; here, only declare.
    void applyBreak (int decrement);

    void speedUp(int increment);




}
