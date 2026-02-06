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

  public double getTargetNumber() { // this method is part of the App class, and can only be used if App is instantiated
    // randomly generate a number, multiply it by 7 and divide by 2 and add 1 to it.
    // that's going to be our target number
    double targetNumber = (Math.random() * 7 / 2) + 1;
    return targetNumber;
  }

  public static void main(String[] args) {

    // randomly generate a number, multiply it by 7 and divide by 2 and add 1 to it.
    // that's going to be our target number

    // now, I can write test to verify that the method works as expected
    App app = new App(); // create an instance of the App class
    double target = app.getTargetNumber();
    System.out.println("Target number: " + target);

    House myHouse = new House(); // create an instance of the House class
    myHouse.ringDoorbell(); // call the ringDoorbell method on the House instance
   
  }

}

