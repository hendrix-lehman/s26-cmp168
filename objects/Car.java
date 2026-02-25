// add package name here if needed
//
class Car {

  // attributes, properties, fields, instance variables or members variables
  private String make;
  private String model;
  private int year;
  private String color;

  public Car() {
    // default constructor
    System.out.println("Default constructor called.");
  }

  // Constructor
  public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  // Overloaded constructor with color
  public Car(String make, String model, int year, String color) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
  }

  // Getters
  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  public String getColor() {
    return color;
  }

  // setters
  public void setColor(String color) {
    this.color = color;
  }

  // behaviors, methods or member functions
  public void start() {
    System.out.println("The car is starting.");
  }

  public void stop() {
    System.out.println("The car is stopping.");
  }

  // Method to display car information
  public void displayInfo() {
    System.out.println("Car Information:");
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("Color: " + (color != null ? color : "N/A"));
  }

}

