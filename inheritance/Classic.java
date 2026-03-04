// Old style phone
//
class Classic extends Phone {
  
  private String style;
  
  public Classic() {
    super(); // Call the constructor of the parent class (Phone)
    this.style = "Rotary";
  }

  public Classic(String style) {
    super(); // Call the constructor of the parent class (Phone)
    this.style = style;
  }
  
  public String getStyle() {
    return style;
  }
}

