import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class ZooTest {
  Zoo zoo;
  Enclosure monkeyEnclosure;
  Enclosure snakeEnclosure;

  @Before
  public void before() {
    zoo = new Zoo("Edinburgh Zoo");
    monkeyEnclosure = new MonkeyEnclosure("Monkey Enclosure", 15);
    snakeEnclosure = new SnakeEnclosure("Snake Enclosure", 20);
  }

  @Test
  public void hasName() {
    assertEquals("Edinburgh Zoo", zoo.getName());
  }

  @Test
  public void zooStartsEmpty() {
    assertEquals(0, zoo.enclosureCount());
  }

  @Test
  public void canAddMonkeyEnclosureToZoo() {
    zoo.addToZoo(monkeyEnclosure);
    assertEquals(1, zoo.enclosureCount());
  }

  @Test
  public void canAddSnakeEnclosureToZoo() {
    zoo.addToZoo(snakeEnclosure);
    assertEquals(1, zoo.enclosureCount());
  }

  @Test
  public void canRemoveEnclosureFromZoo() {
    zoo.addToZoo(monkeyEnclosure);
    zoo.removeFromZoo(monkeyEnclosure);
    assertEquals(0, zoo.enclosureCount());
  }


}