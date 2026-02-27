// add package name here if needed
//
class Dog {
  private String name;
  private boolean vaccinated;
  private int age; // in years

  private static int numDogsCreated = 0; // static variable to track number of Dog instances created

  public Dog() {
    numDogsCreated++; // increment count each time a Dog is created
  }

  public Dog(String name, boolean vaccinated, int age) {
    numDogsCreated++; // increment count each time a Dog is created
    this.name = name;
    this.vaccinated = vaccinated;
    this.age = age;
  }

  // getters and setters
  //
  public String getName() {
    return name;
  }

  public boolean isVaccinated() {
    return vaccinated;
  }

  public int getAge() {
    return age;
  }

  public static int getNumDogsCreated() {
    return numDogsCreated;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setVaccinated(boolean vaccinated) {
    this.vaccinated = vaccinated;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

