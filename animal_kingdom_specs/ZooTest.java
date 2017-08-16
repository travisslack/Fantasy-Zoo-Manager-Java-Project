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
  Visitor visitor1;
  Visitor visitor2;


  @Before
  public void before() {
    edinburghZoo = new Zoo("Edinburgh Zoo", 1000, 15.00);
    londonZoo = new Zoo("London Zoo", 5000, 20.00);
    edinburghMonkeyEnclosure = new MonkeyEnclosure("Edinburgh Monkey Enclosure", 15);
    edinburghSnakeEnclosure = new SnakeEnclosure("Edinburgh Snake Enclosure", 20);
    londonMonkeyEnclosure = new MonkeyEnclosure("London Monkey Enclosure", 17);
    edinburghZooKeeper = new ZooKeeper("David");
    londonZooKeeper = new ZooKeeper("Steve");
    visitor1 = new Visitor("J", 70.00);
    visitor2 = new Visitor("D", 60.00);
  }

  @Test
  public void hasName() {
    assertEquals("Edinburgh Zoo", edinburghZoo.getName());
  }

  @Test
  public void canEnclosureInsideZooStartsEmpty() {
    assertEquals(0, edinburghZoo.enclosureCount());
  }

  @Test
  public void hasEntryPrice() {
    assertEquals(15.00, edinburghZoo.entryPriceAmount(), 0.01);
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

  @Test
  public void zooIsNotFull() {
  edinburghZoo.addToZoo(visitor1);
  assertEquals(1, edinburghZoo.visitorCount());
  }

  @Test
  public void canAdmitVisitorTest() {
    boolean result = edinburghZoo.canAdmitVisitor();
    assertEquals(true, result);
  }

  @Test
  public void cantAdmitVisitorTest() {
    edinburghZoo.capacity = 2;
    edinburghZoo.addToZoo(visitor1);
    edinburghZoo.addToZoo(visitor2);
    boolean result = edinburghZoo.canAdmitVisitor();
    assertEquals(false, result);
  }





}