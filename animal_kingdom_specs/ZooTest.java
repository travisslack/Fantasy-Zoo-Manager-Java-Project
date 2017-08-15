import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class ZooTest {
  Zoo edinburghZoo;
  Zoo londonZoo;
  MonkeyEnclosure edinburghMonkeyEnclosure;
  SnakeEnclosure edinburghSnakeEnclosure;
  MonkeyEnclosure londonMonkeyEnclosure;
  ZooKeeper edinburghZooKeeper;
  ZooKeeper londonZooKeeper;


  @Before
  public void before() {
    edinburghZoo = new Zoo("Edinburgh Zoo");
    londonZoo = new Zoo("London Zoo");
    edinburghMonkeyEnclosure = new MonkeyEnclosure("Edinburgh Monkey Enclosure", 15);
    edinburghSnakeEnclosure = new SnakeEnclosure("Edinburgh Snake Enclosure", 20);
    londonMonkeyEnclosure = new MonkeyEnclosure("London Monkey Enclosure", 17);
    edinburghZooKeeper = new ZooKeeper("David");
    londonZooKeeper = new ZooKeeper("Steve");
  }

  @Test
  public void hasName() {
    assertEquals("Edinburgh Zoo", edinburghZoo.getName());
  }

  @Test
  public void enclosuresInsideZooStartsEmpty() {
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