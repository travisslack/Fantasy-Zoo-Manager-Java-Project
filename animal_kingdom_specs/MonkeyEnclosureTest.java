import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class MonkeyEnclosureTest {
  MonkeyEnclosure monkeyEnclosure;

  @Before
  public void before() {
    monkeyEnclosure = new MonkeyEnclosure("Monkey Enclosure", 15);
  }

  @Test 
  public void hasName() {
    assertEquals("Monkey Enclosure", monkeyEnclosure.getName());
  }

  @Test
  public void monkeyEnclosureStartsEmpty() {
    assertEquals(15, monkeyEnclosure.size());
  }
}