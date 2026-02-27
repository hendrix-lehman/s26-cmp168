// add package name here if needed
//
class Phone {

  private String speakerBrand;
  private String microphoneBrand;
  private String dialpadBrand;

  public Phone() {
    this.speakerBrand = "Generic Speaker";
    this.microphoneBrand = "Generic Microphone";
    this.dialpadBrand = "Generic Dialpad";
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


}

