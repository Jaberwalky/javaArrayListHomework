import java.util.*;

public class Photographer {

  private String name;
  private ArrayList<Camera> cameras;

  public Photographer(String name){
    this.name = name;
    this.cameras = new ArrayList<Camera>();
  }

  public String getName(){
    return this.name;
  }

  public void addCamera(Camera camera){
    this.cameras.add(camera);
  }

  public int countCameras(){
    return this.cameras.size();
  }

  public Camera removeCamera(){
    if (countCameras() > 0) {
      return this.cameras.remove(0);
    }
    return null;
  }

  public String printFullDetails(){
    String fullString = "";
    for (Camera camera : this.cameras){
      fullString += camera.printDetails();
    }
    return fullString;
  }



}
