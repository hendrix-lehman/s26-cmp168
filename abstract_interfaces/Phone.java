// 
// The concept of the phone. 
// Not really the real phone but a description of the phone.
//
// An abstract class is a class is like a NPC in a game.
// Or, non-playable class
abstract class Phone {

  // member variable
  private String brand;

  // constructor
  public Phone() {
    this.brand = "Unknown";
  }

  public Phone(String brand) {
    this.brand = brand;
  }

  // getters
  public String getBrand() {
    return brand;
  }

  // abstract method
  public void pickupToTalk() {
    System.out.println("pick up the receiver to talk");
  }

  public void pickupToListen() {
    System.out.println("lift the receiver to answer");
  }

  @Override
  public String toString() {
    return "Phone [brand=" + brand + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Phone other = (Phone) obj;
    if (brand == null) {
      if (other.brand != null)
        return false;
    } else if (!brand.equals(other.brand))
      return false;
    return true;
  }
}

