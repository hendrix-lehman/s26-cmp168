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
   
  }

}

