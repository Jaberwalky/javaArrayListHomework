public class DigitalCamera implements Camera{

  private String name;
  private double megapixels;
  private int yearPurchased;

  public DigitalCamera(String name, double megapixels, int yearPurchased){
    this.name = name;
    this.megapixels = megapixels;
    this.yearPurchased = yearPurchased;
  }

  public String getName(){
    return this.name;
  }

  public String printDetails(){
    return (this.name + ", " + this.megapixels + " Megapixels, " + this.yearPurchased + ".");
  }


}
