import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class ZooTest {
  Zoo zoo;
  Enclosure tigerEnclosure;
  Enclosure monkeyEnclosure;

  @Before
  public void before() {
    zoo = new Zoo("Edinburgh Zoo");
    tigerEnclosure = new TigerEnclosure("Tiger Enclosure", 10);
    monkeyEnclosure = new MonkeyEnclosure("Monkey Enclosure", 15);
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
  public void canAddTigerEnclosureToZoo() {
    zoo.addToZoo(tigerEnclosure);
    assertEquals(1, zoo.enclosureCount());
  }

  @Test
  public void canAddMonkeyEnclosureToZoo() {
    zoo.addToZoo(monkeyEnclosure);
    assertEquals(1, zoo.enclosureCount());
  }

  @Test
  public void canRemoveEnclosureFromZoo() {
    zoo.addToZoo(tigerEnclosure);
    zoo.removeFromZoo(tigerEnclosure);
    assertEquals(0, zoo.enclosureCount());
  }


}