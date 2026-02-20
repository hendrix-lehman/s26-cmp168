

// class House describes a house.
// class is use to describe a thing
class House {
  // member variables, fields, attributes, properties,
  // whatever you want to call them, they are all the same.
  // they are use to store information about the object
  //
  // member variables can be thought as "data" that describes the object.
  // so, the "state" of the object is described by its member variables.
  private String address;

  private boolean hasGarage;

  private String color = "blue";
  // by initializing the color variable,
  // we are guaranteeing that every House object is blue by default

  // constructors
  // are use to initialize the object when it is created
  // these are special methods that are called when an object is created.
  //
  // your code should be a simple as possible
  // not resource intensive, and not time intensive.
  public House() {
    // this is the default constructor, it takes no arguments
    // and it initializes the member variables to default values
    this.address = "123 Main St";
    this.hasGarage = false;
  } 

  // overloaded constructor, this one takes the color as an argument
  public House(String color) {
    // this constructor takes a color as an argument and initializes the color member variable
    this.color = color;
  }

  public House(String color, String address) {
    // this constructor takes the color and address as arguments and initializes the color and address member variables
    this.color = color;
    this.address = address;
  }
  
  private class Room {
    // Room class implementation
  }

  // setters and getters
  public void setAddress(String address) {
    this.address = address;
  }

  public void setGarage(boolean hasGarage) {
    this.hasGarage = hasGarage;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getAddress() {
    return this.address;
  }

  public boolean getGarage() {
    return this.hasGarage;
  }

  public String getColor() {
    return this.color;
  }

  // this is a method
  // methods are use to define the behavior of the object
  // they have a return type, a name, and a body
  // in this case the return type is void,
  // meaning that this method does not return anything
  //
  // methods can be overloaded as well
  //
  // by convention,
  // methods names should start with a lowercase letter
  // and if using multiple words, each word should start 
  // with an uppercase letter
  public void ringDoorbell() {
    System.out.println("Ding Dong! Someone is at the door!");
  }

  // this is a static method, it belongs to the class rather than
  // to any particular instance of the class, it can be called without creating an instance of the class
  public static void ringDoorbell(String name) {
    System.out.println("Ding Dong! " + name + " is at the door!");
  }

  public void downloadTheInternet() {
    // this method is not a good idea, it would be resource intensive and time intensive
    // we should avoid writing code like this
    //
    //connect to some Internet service provider to exchange keys
    exchangeKeys();
  }

  private void exchangeKeys() {
    // this method is not a good idea, it would be resource intensive and time intensive
    // we should avoid writing code like this
  }
}
