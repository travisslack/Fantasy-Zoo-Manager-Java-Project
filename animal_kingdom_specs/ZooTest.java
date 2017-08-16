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
  Visitor visitor3;
  Monkey monkey1;
  Snake snake1;


  @Before
  public void before() {
    edinburghZoo = new Zoo("Edinburgh Zoo", 1000, 15.00, 0.00, 2000.00);
    londonZoo = new Zoo("London Zoo", 5000, 20.00, 0.00, 3500.00);
    edinburghMonkeyEnclosure = new MonkeyEnclosure("Edinburgh Monkey Enclosure", 15);
    edinburghSnakeEnclosure = new SnakeEnclosure("Edinburgh Snake Enclosure", 20);
    londonMonkeyEnclosure = new MonkeyEnclosure("London Monkey Enclosure", 17);
    edinburghZooKeeper = new ZooKeeper("David");
    londonZooKeeper = new ZooKeeper("Steve");
    visitor1 = new Visitor("J", 70.00);
    visitor2 = new Visitor("D", 60.00);
    visitor3 = new Visitor("Z", 10.00);
    monkey1 = new Monkey("Julius", "Brown", 4, 200.00);
    snake1 = new Snake("Kaa", "Gold", 6, 100.00);
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
  public void zooHasIncome() {
    assertEquals(0.00, edinburghZoo.zooTotalIncome(), 0.01);
  }

  @Test
  public void zooHasBudget() {
    assertEquals(2000.00, edinburghZoo.zooTotalBudget(), 0.01);
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
    edinburghZoo = new Zoo("Edinburgh Zoo", 2, 15.00, 0.00, 2000.00);
    edinburghZoo.addToZoo(visitor1);
    edinburghZoo.addToZoo(visitor2);
    boolean result = edinburghZoo.canAdmitVisitor();
    assertEquals(false, result);
  }

  @Test
  public void canAdmitVisitorWithReqFundsTest(){
    visitor1 = new Visitor("J", 70.00);
    edinburghZoo.admitVisitor(visitor1);
    assertEquals(55.00, visitor1.getBudget(), 0.01);
    assertEquals(1, edinburghZoo.visitorCount());
  }

  @Test
  public void cantAdmitVisitorWithoutReqFundsTest() {
    visitor3 = new Visitor("Z", 10.00);
    edinburghZoo.admitVisitor(visitor3);
    assertEquals(10.00, visitor3.getBudget(), 0.01);
    assertEquals(0, edinburghZoo.visitorCount());
  }

  @Test
  public void incomeIncreasesWhenVisitorEntersTest() {
    edinburghZoo = new Zoo("Edinburgh Zoo", 1000, 15.00, 0.00, 2000.00);
    visitor1 = new Visitor("J", 70.00);
    edinburghZoo.admitVisitor(visitor1);
    assertEquals(15.00, edinburghZoo.zooTotalIncome(), 0.01);
  }

  @Test
  public void canAddAnimalToZoo() {
    edinburghZoo.addToZoo(monkey1);
    assertEquals(1, edinburghZoo.animalCount());
  }

  @Test
  public void canRemoveAnimalFromZoo() {
    edinburghZoo.addToZoo(monkey1);
    edinburghZoo.removeFromZoo(monkey1);
    assertEquals(0, edinburghZoo.animalCount());
  }

  @Test
  public void canTransferAnimalTest() {
    edinburghZoo.addToZoo(monkey1);
    edinburghZoo.transferAnimalToOtherZoo(monkey1, londonZoo);
    assertEquals(1, londonZoo.animalCount());
    assertEquals(0, edinburghZoo.animalCount());
  }

  @Test
  public void canGetTotalPotentialProfit() {
    edinburghZoo.addToZoo(monkey1);
    edinburghZoo.addToZoo(snake1);
    assertEquals(300.00, edinburghZoo.totalPotentialProfit(), 0.01);
  }

  // @Test void canHouseAnimal(){
  //   edinburghZoo.houseAnimal(monkey1);

  // }


  

}