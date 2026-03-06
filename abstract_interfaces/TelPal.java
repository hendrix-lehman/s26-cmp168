// add package name here if needed
//
class TelPal extends Phone implements PhoneDial {

  private boolean callReceived = false;
  
  @Override
  public void call(String number) {
    if (callReceived) {
      // won't be able to connect caller
      System.out.println("Cannot dial " + number + " using " + getBrand() + " TelPal because it is currently in use.");
      return;
    }
    System.out.println("Dialing " + number + " using " + getBrand() + " TelPal.");
    callReceived = true;
  }

  @Override
  public void receiveCall(String number) {
    if (callReceived) {
      // won't be able to connect caller
      System.out.println("Cannot receive call from " + number + " on " + getBrand() + " TelPal because it is currently in use.");
      return;
    }
    // connect caller only if not currently in use
    System.out.println("Receiving call from " + number + " on " + getBrand() + " TelPal.");
  }
}

