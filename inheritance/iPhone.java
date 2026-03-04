// A type of SmartPhone
// made by Apple
//
class iPhone extends SmartPhone {
  
  private String model;
  
  public iPhone(String model) {
    super(); // Call the constructor of the parent class (SmartPhone)
    System.out.println("Creating an iPhone with model: " + model);
    this.model = model;
  }
  
  public String getModel() {
    return model;
  }

  @Override
  public void makeCall(String number) {
    System.out.println("ABC");
  }

  public void testCall() {
    super.makeCall("123-456-7890");
    System.out.println("Testing call functionality on " + model);
  }
}

