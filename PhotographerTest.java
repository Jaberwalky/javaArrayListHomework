import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  DigitalCamera digitalCamera;

  @Before
  public void before(){
    photographer = new Photographer("Lucy");
    digitalCamera = new DigitalCamera("Nikon D810", 36.3, 2016);
  }

  @Test
  public void hasName(){
    assertEquals("Lucy", photographer.getName());
  }

  @Test
  public void canAddCamera(){
    photographer.addCamera(digitalCamera);
    assertEquals(1, photographer.countCameras());
  }

  @Test
  public void canRemoveCamera(){
    photographer.addCamera(digitalCamera);
    assertEquals(digitalCamera, photographer.removeCamera());
  }


}
