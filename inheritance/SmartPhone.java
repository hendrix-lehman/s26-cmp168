// This class is a child of the Phone class.
// In our simple design, it can be think of as the
// parent of all future smart phone types.
//
class SmartPhone extends Phone {
  
  private String operatingSystem;

  public SmartPhone() {
    super(); // Call the constructor of the parent class (Phone)
    this.operatingSystem = "Generic OS";
  }

  public String getOperatingSystem() {
    return operatingSystem;
  }
}

