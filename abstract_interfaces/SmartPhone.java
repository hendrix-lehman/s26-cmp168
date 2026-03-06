// add package name here if needed
//
class SmartPhone extends Phone implements PhoneDial {

  @Override
  public void call(String number) {
    System.out.println("Calling " + number + " using " + getBrand() + " smartphone.");
  }

  @Override
  public void receiveCall(String number) {
    System.out.println("ring to alert user of incoming call...");

    System.out.println("Receiving call from " + number + " on " + getBrand() + " smartphone.");
  }
}

