import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class MonkeyTest {
  Monkey monkey;

  @Before
  public void before() {
    monkey = new Monkey("Julius", "Brown", 4);
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

}
