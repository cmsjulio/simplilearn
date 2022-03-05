package pck09staticKeyword;

class StudentStatic {
    // static blocks should be stated in the beginning of the class
    // you can only access static members of the class inside the block.
    static {
        System.out.println("Initializer code.");
        // I can also put in here the other static variables declaration -- even without the static keyword, like:
//        String college = "XYZ";
//        int count = 0;

        // this block is executed only ONCE when the program is loaded in the runtime.

    }

    // if you dont use the static keyword, these variables will be initialized everytime you implement a new Student object.
    // static attributes are only initialized when the class is initialized (rather than when the objects are initialized)

    String name;
    int age;
    String address;
    int id;

    static String college = "XYZ";
    static int count=0;

    public StudentStatic (String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
        studentCount();
        this.id=count;
    }

    public int getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // para criar um método que conta o total de estudantes criados;
    // static methods can only access static member variables of the class.
    // thus, count must be declared as static to be accessed in the static method studentCount;
    static void studentCount(){
        count=count+1;
    }

    // an instance method CAN access a static member:
    public static int getCount() {
        return count;
    }
}
