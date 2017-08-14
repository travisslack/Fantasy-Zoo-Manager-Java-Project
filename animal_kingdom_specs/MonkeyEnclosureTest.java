import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class MonkeyEnclosureTest {
  MonkeyEnclosure monkeyEnclosure;
  Monkey monkey;

  @Before
  public void before() {
    monkeyEnclosure = new MonkeyEnclosure("Monkey Enclosure", 15);
    monkey = new Monkey("Julius", "Brown", 4);
  }

  @Test 
  public void hasName() {
    assertEquals("Monkey Enclosure", monkeyEnclosure.getName());
  }

  @Test
  public void monkeyEnclosureStartsEmpty() {
    assertEquals(0, monkeyEnclosure.animalCount());
  }

  @Test
  public void canAddMonkeyToMonkeyEnclosure() {
    monkeyEnclosure.addToEnclosure(monkey);
    assertEquals(1, monkeyEnclosure.animalCount());
  }
}