public class AnalogCamera implements Camera{

  private String name;
  private String filmFormat;
  private int yearPurchased;

  public AnalogCamera(String name, String filmFormat, int yearPurchased){
    this.name = name;
    this.filmFormat = filmFormat;
    this.yearPurchased = yearPurchased;
  }

  public String printDetails(){
    return (this.name + ", " + this.filmFormat + ", Purchased :" + this.yearPurchased + ".");
  }
}
