package pck08polymorphism;

public class MethodOverloadingDemo {

    public int multiply (int x, int y){
        return (x * y);
    }
    // avoid using it, rather name each method accordingly (multiplyThreeNumbers, e.g.)
    // the name of the method remains the same
    // the return type may change or not;
    // here is multiply being overloaded.
    public int multiply (int x, int y, int z){
        return (x * y * z);
    }

    public double multiply (double x, double y){
        return (x * y);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();


        // based on the number of arguments you supply, Java will take care of calling the right method.
        System.out.println(demo.multiply(10,20));
        System.out.println(demo.multiply(10,20,30));
        System.out.println(demo.multiply(10.5,20.5));
    }
}
