package pck09staticKeyword;

/*

    imagine a student class;
    all the students will belong to the same college; that variable wont change whatever the student object you create;

    imagine an employee management system;
    and you want to maintain the employee number: first object should have number 1, second employee object created should have 2, etc.
    by the end you want to know how many employee objects you have created.
    each object would have to know the state of the previous one.
    for that you would have to use static keywords.

    all the objects get the same copy of the static member variable.

    static member variable = class variable.

    values across different objects don't change -- or a particular variable should be shared.

    methods can also be static: belonging to the class rather than to the object.

    static can also be used to declare constants:
    static final double PI = 3.1415926535;

 */

public class StaticKeyword {
    public static void main(String[] args) {
        StudentStatic student = new StudentStatic("John", 25, "23 East, California.");

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
        System.out.println(StudentStatic.college);
        System.out.println(StudentStatic.getCount());
        System.out.println("Id do student: " + student.getId());

        StudentStatic student2 = new StudentStatic("John", 25, "23 East, California.");
        System.out.println(StudentStatic.getCount());
        System.out.println("Id do student2: " + student2.getId());

        StudentStatic student3 = new StudentStatic("John", 25, "23 East, California.");
        System.out.println(StudentStatic.getCount());
        System.out.println("Id do student3: " + student3.getId());

        StudentStatic student4 = new StudentStatic("John", 25, "23 East, California.");
        System.out.println(StudentStatic.getCount());
        System.out.println("Id do student4: " + student4.getId());


        //using student.college is accessing the member using the instance way (the way we use when dealing with objects.)
        //static members should be accessed by using the class name, rather than the object name: StudentStatic.college.
    }
}
