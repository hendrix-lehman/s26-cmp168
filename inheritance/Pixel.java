// add package name here if needed
//
class Pixel extends SmartPhone {
  private PixelSpeaker speaker;

  class PixelSpeaker extends Speaker {
    public PixelSpeaker() {
      super("Pixel Speaker Brand");
    }
  }
  
  private String model;

  public Pixel() {
    super(); // Call the constructor of the parent class (SmartPhone)
    this.model = "Generic Pixel Model";
    this.speaker = new PixelSpeaker(); // Initialize the speaker with the PixelSpeaker
  }
  
  public Pixel(String model) {
    super(); // Call the constructor of the parent class (SmartPhone)
    this.model = model;
    this.speaker = new PixelSpeaker(); // Initialize the speaker with the PixelSpeaker
  }

  public Pixel(String model, String operatingSystem) {
    super(); // Call the constructor of the parent class (SmartPhone)
    this.model = model;
    this.speaker = new PixelSpeaker(); // Initialize the speaker with the PixelSpeaker
    // Override the operating system for this Pixel phone
    // Note: This is not a good design as it breaks encapsulation, but it's just for demonstration
    // In a real design, we would have a better way to set the operating system for different phone types
    // For example, we could have a constructor in SmartPhone that takes the operating system as a parameter
  }

  
  public String getModel() {
    return model;
  }

  @Override
  public String toString() {
    return "Pixel{" +
            "model='" + model + '\'' +
            ", operatingSystem='" + getOperatingSystem() + '\'' +
            ", speakerBrand='" + getSpeakerBrand() + '\'' +
            ", microphoneBrand='" + getMicrophoneBrand() + '\'' +
            ", dialpadBrand='" + getDialpadBrand() + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object obj) {

    // if the object is also a SmartPhone, we can consider them equal
    // if (obj instanceof SmartPhone) {
      // return true;
    // }

    if (this == obj) return true; // Check if they are the same object
    if (obj == null || getClass() != obj.getClass()) return false; // Check if the object is null or of different class

    Pixel pixel = (Pixel) obj; // Cast the object to Pixel

    // Check if the model and operating system are the same
    return model.equals(pixel.model) && getOperatingSystem().equals(pixel.getOperatingSystem());
  }
}

