import static org.junit.Assert.assertEquals;
import org.junit.*;

public class DigitalCameraTest{
  DigitalCamera camera;

  @Before
  public void before(){
    camera = new DigitalCamera("Nikon D810", 36.3, 2016);
  }

  @Test
  public void hasName(){
    assertEquals("Nikon D810", camera.getName());
  }





}
