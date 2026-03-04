// add package name here if needed
//
class App {

  public void printPhoneInfo(Phone phone) {
    System.out.println("Phone info:" + phone.toString());
  }

  public void makingCall(Phone phone, String number) {
    phone.makeCall(number);
  }

  public static void main(String[] args) {

    App app = new App();
    
    Pixel pixelPhone = new Pixel("Pixel 5");
    // iPhonePhone variable is the object reference of type iPhone
    iPhone iPhonePhone = new iPhone("iPhone 12");
    // iPhonePhone2 variable is the object reference of type iPhone
    iPhone iPhonePhone2 = new iPhone("iPhone 13");
    pixelPhone.makeCall("123-456-7890");
    iPhonePhone.receiveCall("123-456-7890");

    iPhonePhone2.testCall();
    iPhonePhone2.makeCall("987-654-3210");

    System.out.println("Pixel phone toString: " + pixelPhone.toString());
    System.out.println("Pixel phone equals: " + pixelPhone.equals(iPhonePhone));

    Classic classicPhone = new Classic();

    System.out.println("printing phone info:");
    app.printPhoneInfo(pixelPhone);
    app.printPhoneInfo(iPhonePhone);
    app.printPhoneInfo(iPhonePhone2);
    app.printPhoneInfo(classicPhone);
  }
}

