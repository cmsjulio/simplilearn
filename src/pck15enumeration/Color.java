package pck15enumeration;

enum Color {
  RED("red"), GREEN("green"), BLUE("blue");

  // WHAT_THE_CONSUMER_SEES("whatIsUsedInTheApplication");
  // WHO("World Health Organization");

  // after defining values inside the parenthesis, do as below:

  private String value;

  Color(String value){
    this.value=value;
  }

  public String getValue(){
    return value;
  }

  /*

    To read the constants, do Color.RED, Color.GREEN, Color.BLUE;
    To refer to the value of the Enum class, use getValue()

   */
}

