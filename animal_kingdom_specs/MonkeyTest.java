import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class MonkeyTest {
  Monkey monkey;
  Plant plant;
  Banana banana;

  @Before
  public void before() {
    monkey = new Monkey("Julius", "Brown", 4);
    plant = new Plant();
    banana = new Banana();
  }

  @Test
  public void hasName() {
  assertEquals("Julius", monkey.getName());
  }

  @Test 
  public void hasColour() {
    assertEquals("Brown", monkey.getColour());
  }

  @Test 
  public void hasAge() {
    assertEquals(4, monkey.getAge());
  }

  @Test
  public void stomachStartsEmpty() {
    assertEquals(0, monkey.foodCount());
  }

}
