package pck04encapsulation;

/*

    restrict accessing of a class to the outside world;
    security feature;
    make objects private and define the public methods with which the outside world will access them;

 */

class Student {
    private String name;
    private int age;
    private String address;

    public Student (String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setAge (int age){
        this.age = age;
    }

    public void setAddress (String address){
        this.address = address;
    }

    public String getName (){
        return this.name;
    }

    public String getAddress (){
        return this.address;
    }

    public int getAge(){
        return this.age;
    }


}
