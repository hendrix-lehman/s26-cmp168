// In an object-oriented programming language like Java,
// everything is organized around classes and objects.
//
// The name of the class must match the name of the file.
// So in this case, the file is named App.java,
// so the class must be named App.
// We also need to follow the Java naming conventions for classes,
// which state that class names should start with an uppercase letter
// and if using multiple words, each word should start with an uppercase letter
class App {
  // methods are associated with classes
  // and since in Java everything is inside a class
  // all "functions" must be methods
  //

  // this is a method that returns a double
  public double getTargetNumber() { // this method is part of the App class, and can only be used if App is instantiated
    // randomly generate a number, multiply it by 7 and divide by 2 and add 1 to it.
    // that's going to be our target number
    double targetNumber = (Math.random() * 7 / 2) + 1;
    return targetNumber;
  }

  // this is a value method that take two primitive type (integer) as input parameters and return an integer as output
  // when this method is called, whatever value are passed-in to the two primitive type input parameters will be copied into 
  // the input variable a and b.
  public int addTwoNumbersTimesRandomNumber(int a, int b) {
    // this method takes two integers as arguments, adds them together, and then multiplies the result by a random number between 0 and 1

    // we are purposefully changing the value for a, which should only be a local change.
    a = 0; // this will not change the value of a in the caller, because a is a primitive type and is passed by value
    System.out.println("local method a: " + a); // print the value of a, which should be 0
    int sum = a + b;
    double randomNumber = Math.random();
    System.out.println("Random number: " + randomNumber);
    return (int)(sum * randomNumber);
  }

  // this is a void method that takes two reference type (House) as input parameters and does not return anything
  // when this method is called, whatever "value" (reference) are passed-in to the two reference type input parameters will be copied into the input variable a and b.
  public void updateHouses(House d, House e) {
    // this method takes two House objects as arguments and updates their color to "yellow"

    System.out.println("local method d color: " + d.getColor()); // print the color of d, which should be the same as the color of the House object in the caller, because d is a reference type and is passed by reference
    System.out.println("local method e color: " + e.getColor()); // print the color of e, which should be the same as the color of the House object in the caller, because e is a reference type and is passed by reference

    // we are purposefully changing the color of the House object d, which should change the color of the House object in the caller, because d is a reference type and is passed by reference
    d.setColor("MAGENTA"); // this will change the color of the House object in the caller, because d is a reference type and is passed by reference

  }

  public void updateName(String name) {
    // this method takes a String as an argument and updates the name to "Charlie"
    name = "Charlie"; // this will not change the value of name in the caller, because name is a reference type but String is immutable, so it is effectively passed by value
    System.out.println("local method name: " + name); // print the value of name, which should be Charlie
  }

  public static void main(String[] args) {

    House.ringDoorbell("Bob"); // call the static ringDoorbell method on the House class, this method does not require an instance of the House class to be called

    // randomly generate a number, multiply it by 7 and divide by 2 and add 1 to it.
    // that's going to be our target number

    // now, I can write test to verify that the method works as expected
    App app = new App(); // create an instance of the App class
    double target = app.getTargetNumber();
    System.out.println("Target number: " + target);

    House myHouse = new House(); // create an instance of the House class, we call this an object of the House class
    myHouse.downloadTheInternet(); // call the downloadTheInternet method on the House instance, this is not a good idea, it would be resource intensive and time intensive
    myHouse.ringDoorbell(); // call the ringDoorbell method on the House instance

    House redHouse = new House("red"); // create another instance of the House class, this time we use the overloaded constructor to set the color to red
    redHouse.ringDoorbell(); // call the ringDoorbell method on the redHouse instance

    House greenHouse = new House("green", "456 Oak St"); // create another instance of the House class, this time we use the overloaded constructor to set the color to green and address to 456 Oak St
    House.ringDoorbell("Alice"); // call the static ringDoorbell method on the House class, this method does not require an instance of the House class to be called
    // not accessible here
    // greenHouse.exchangeKeys(); // call the exchangeKeys method on the greenHouse instance, this is not a good idea, it would be resource intensive and time intensive
   
    int a = 5; // this is a primitive type variable, it holds the value 5
    int y = 10; // this is another primitive type variable, it holds the value 10
    System.out.println("BEFORE: a: " + a); // print the value of x, which should be 5
    int value = app.addTwoNumbersTimesRandomNumber(a, y); // call the addTwoNumbersTimesRandomNumber method on the app instance, this will return a random number between 0 and 15 w
    System.out.println("AFTER: a: " + a); // print the value of x again, which should still be 5, because x is a primitive type and is passed by value

    System.out.println("Value: " + value);
    
    System.out.println("BEFORE: redHouse color: " + redHouse.getColor()); // print the color of redHouse, which should be red
    System.out.println("BEFORE: greenHouse color: " + greenHouse.getColor()); // print the color of greenHouse, which should be green
    app.updateHouses(redHouse, greenHouse); // call the updateHouses method on the app instance, this will change the color of the redHouse to MAGENTA, but not change the color of the greenHouse, because redHouse is passed by reference and greenHouse is passed by reference
    System.out.println("AFTER: redHouse color: " + redHouse.getColor()); // print the color of redHouse again, which should now be MAGENTA, because redHouse is passed by reference and is updated in the updateHouses method
    System.out.println("AFTER: greenHouse color: " + greenHouse.getColor()); // print the color of greenHouse again, which should still be green, because greenHouse is passed by reference and is not updated in the updateHouses method

    String name = "Alice"; // this is a reference type variable, it holds a reference to the String object "Alice"
    System.out.println("BEFORE: name: " + name); // print the value of name, which should be Alice
    app.updateName(name); // call the updateName method on the app instance, this will not change the value of name in the caller, because name is a reference type but String is immutable, so it is effectively passed by value
    // the reason that name is still Alice is because String is immutable, it can not be changed.
    System.out.println("AFTER: name: " + name); // print the value of name again, which should still be Alice, because name is a reference type but String is immutable, so it is effectively passed by value
    //

  }

}

