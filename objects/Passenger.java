// add package name here if needed
//
class Passenger {

  private String name;
  private int birthYear;

  public Passenger() {
    this.name = "";
    this.birthYear = 1900;
  }

  public int calculateAge(int currentYear) {
    if (currentYear < birthYear) {
      return -1; // Invalid case, current year is before birth year
    }
    return currentYear - birthYear;
  }
}

