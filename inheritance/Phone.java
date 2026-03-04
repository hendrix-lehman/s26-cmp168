// In our design, the Phone class is a parent to all future phone types.
//
class Phone {

  private String speakerBrand;
  private String microphoneBrand;
  private String dialpadBrand;

  public Phone() {
    this.speakerBrand = "Generic Speaker";
    this.microphoneBrand = "Generic Microphone";
    this.dialpadBrand = "Generic Dialpad";
    System.out.println("Creating a generic phone with " + speakerBrand + ", " + microphoneBrand + ", and " + dialpadBrand);
  }

  public String getSpeakerBrand() {
    return speakerBrand;
  }

  public String getMicrophoneBrand() {
    return microphoneBrand;
  }

  public String getDialpadBrand() {
    return dialpadBrand;
  }

  public void makeCall(String number) {
    System.out.println("Dialing " + number + " using " + dialpadBrand);
  }

  public void receiveCall(String number) {
    System.out.println("Receiving call from " + number + " using " + microphoneBrand);
  }


}

