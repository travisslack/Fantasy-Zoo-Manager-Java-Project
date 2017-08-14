import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class ZooKeeperTest {
  ZooKeeper zooKeeper;
  Monkey monkey;
  MonkeyEnclosure monkeyEnclosure;
  
  @Before
  public void before() {
    zooKeeper = new ZooKeeper("David");
    monkeyEnclosure = new MonkeyEnclosure("Monkey Enclosure", 15);
    monkey = new Monkey("Julius", "Brown", 4);
  }

  @Test
  public void hasName() {
    assertEquals("David", zooKeeper.getName());
  }

  @Test
  public void addAnimalToEnclosure(){
    zooKeeper.addToEnclosure(monkey, monkeyEnclosure);
    assertEquals(1, monkeyEnclosure.animalCount());
  }

  @Test
  public void removeAnimalFromEnclosure() {
    zooKeeper.addToEnclosure(monkey, monkeyEnclosure);
    zooKeeper.removeFromEnclosure(monkey, monkeyEnclosure);
    assertEquals(0, monkeyEnclosure.animalCount());
  }


}