// add package name here if needed
//
class App {

  public static void main(String[] args) {
    // NOT ALLOWED. ABSTRACT CLASS CANNOT BE INSTANTIATED
    // Phone phone = new Phone(); 
    SmartPhone smartPhone = new SmartPhone();
    smartPhone.call("123-456-7890");
    smartPhone.receiveCall("098-765-4321");

    TelPal telPal = new TelPal();
    telPal.call("555-555-5555");
    telPal.receiveCall("444-444-4444");

    // PhoneDial dialer = new PhoneDial();
  }
}

