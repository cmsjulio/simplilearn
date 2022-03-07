package pck12equalsAndHashCode;

class Student {
  private int rollnumber;
  private String name;
  private String address;

  public Student(int rollnumber, String name, String address){
    this.rollnumber = rollnumber;
    this.name = name;
    this.address = address;
  }

  public int getRollnumber() {
    return rollnumber;
  }

  public void setRollnumber(int rollnumber) {
    this.rollnumber = rollnumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj) //both references pointing to the same object
      return true;

    if (obj == null || obj.getClass() != this.getClass()) //type class not matching or object null
      return false;

    //if none of the returns above, then do the actual rollnumber comparison:

    Student student = (Student) obj; // obj casted into Student type;

    return (student.rollnumber==this.rollnumber);

  }

  // we must also @Override the Hascode method.
  // Hashcode is nothing but a memory bucket in Java where your object is stored. A memory location.
  // The hashcode is the memory footprint where the object is stored.
  /*

  Memory locations:
  1 2 3 4 5

  hashcode will point to a memory location, let us say location 2;
  location 2 can have multiple objects:

  2 - obj1, obj2, obj3

  Equals will be used to compare your object with obj1, obj2 e obj3

  Both Equals and Hashcode will be used to point to the right memory location.

  Thus: we must always override them both rather than only one of them.

   */

  @Override
  public int hashCode(){
    return this.rollnumber;
    // ALWAYS the same parameter as the one passed in the Equals @Override.
    // this will point to the memory location where the objects are stored;
    // if i state: return 1;, then every object will be stored in the same place.
  }
}
