import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class ZooTest {
  Zoo edinburghZoo;
  MonkeyEnclosure edinburghMonkeyEnclosure;
  SnakeEnclosure edinburghSnakeEnclosure;
  ZooKeeper edinburghZooKeeper;

  @Before
  public void before() {
    edinburghZoo = new Zoo("Edinburgh Zoo");
    edinburghMonkeyEnclosure = new MonkeyEnclosure("Edinburgh Monkey Enclosure", 15);
    edinburghSnakeEnclosure = new SnakeEnclosure("Edinburgh Snake Enclosure", 20);
    edinburghZooKeeper = new ZooKeeper("David");
  }

  @Test

  public void hasName() {
    assertEquals("Edinburgh Zoo", edinburghZoo.getName());
  }

  @Test
  public void zooStartsEmpty() {
    assertEquals(0, edinburghZoo.enclosureCount());
  }

  @Test
  public void canAddMonkeyEnclosureToZoo() {
    edinburghZoo.addToZoo(edinburghMonkeyEnclosure);
    assertEquals(1, edinburghZoo.enclosureCount());
  }

  @Test
  public void canAddSnakeEnclosureToZoo() {
    edinburghZoo.addToZoo(edinburghSnakeEnclosure);
    assertEquals(1, edinburghZoo.enclosureCount());
  }

  @Test
  public void canRemoveEnclosureFromZoo() {
    edinburghZoo.addToZoo(edinburghMonkeyEnclosure);
    edinburghZoo.removeFromZoo(edinburghMonkeyEnclosure);
    assertEquals(0, edinburghZoo.enclosureCount());
  }

  @Test
  public void canZooHaveAZooKeeper() {
    edinburghZoo.addToZoo(edinburghZooKeeper);
    assertEquals(1, edinburghZoo.zooKeeperCount());
  }


}