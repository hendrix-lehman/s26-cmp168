// add package name here if needed
//
class App {


  public static void main(String[] args) {
    
    boolean condition = false;
    int value = 10;
    String text = "Hello, World!";

    if (condition) { // 1.  // start of a block within an if statement
      // if condition is true, this gets executed
      if (value < 20) {
        System.out.println("Value is less than 20");
        if (text.length() > 5) {
          System.out.println("Text length is greater than 5");
          if (text.contains("World")) {
            System.out.println("Text contains 'World'");
          }
        }
      } else {
        System.out.println("Value is 20 or more");
      }
      System.out.println("Condition is true");
      System.out.println("This is inside the if block");
      System.out.println("This is still inside the if block");
      System.out.println("End of if block");
    } else if (text.equalsIgnoreCase("hello, world!")) { // 2
    // } else if (text == "Hello, World!") { // this is BAD practice in Java. Never use '==' to compare strings.
      System.out.println("Text matches 'Hello, World!'");
    } else if (value > 5) { //  3
      System.out.println("Value is greater than 5");
    } else if (!condition) { // 4
      System.out.println("Nested if block");
    // } else { // 5
      // if condition is false, this gets executed
      // System.out.println("Condition is false");
    }


    if (value >= 0 && value <= 100 && false) { // 6 using logical AND operator. In this case both conditions must be TRUE
      System.out.println("Value is between 0 and 100");
    } 

    if (true || text.length() > 100) { /// 7 using logical OR operator. In this case only one condition must be TRUE
      System.out.println("Value is between 0 and 100 or text length is greater than 100");

    }

    switch (value) { // the value is checked against each case

      case 10:
        System.out.println("Value is 10");
        // break;
      case 5:
        System.out.println("Value is 5");
        // break;
      default:
        System.out.println("Value is something else");
        break;
    }
    
  }
}

