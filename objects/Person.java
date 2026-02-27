// add package name here if needed
//
class Person {
  // member variables
  private String name;
  private double weight;
  private double height;
  private int age;
  private Dog[] doggies;
  private int numDogs; // controlled variable to track number of Dogs in array
  //
  public static String secret = "SHARE THIS WITH NO ONE!";

  // constructor
  public Person() {
    name = "Doe";
    doggies = new Dog[5]; // initialize array to hold up to 5 Dogs
  }

  // overloaded constructor
  public Person(String name, double weight, double height, int age) {
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.age = age;
    doggies = new Dog[5]; // initialize array to hold up to 5 Dogs
  }

  // getters
  public String getName() {
    return name;
  }

  public double getWeight() {
    return weight;
  }

  public double getHeight() {
    return height;
  }

  public int getAge() {
    return age;
  }

  public Dog[] getDogs() {
    return doggies;
  }

  public String getDogsAsString() {
    return "TODO: getDogsAsString() method not implemented yet.";
  }

  public Dog getDogAtIndex(int index) {
    return null; // TODO: getDogAtIndex() method not implemented yet.
  }

  // setters
  public void setName(String name) {
    this.name = name;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // behavior methods
  public boolean adoptDog(Dog dog) {
    System.out.println(name + " is trying to adopt " + dog.getName() + "...");
    return false; // TODO: adoptDog() method not implemented yet.
  }

  public void speak() {
  }

  public void tellDogToSit(int index) {
  }

  public void tellAllDogsToSit() {
  }


}

