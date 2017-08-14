import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class ZooKeeperTest {
  ZooKeeper zooKeeper;
  Monkey monkey;
  MonkeyEnclosure monkeyEnclosure;
  Banana banana;
  Nut nut;
  
  @Before
  public void before() {
    zooKeeper = new ZooKeeper("David");
    monkeyEnclosure = new MonkeyEnclosure("Monkey Enclosure", 15);
    monkey = new Monkey("Julius", "Brown", 4);
    banana = new Banana();
    nut = new Nut();
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

  @Test
  public void addFoodToAnimal() {
    zooKeeper.feedAnimal(banana, monkey);
    assertEquals(1, monkey.foodCount());
  }

  // - add 2nd animal to enclosure
  // - feed one animal
  // - call zooKeeper.feedHungryAnimals(enclosure)
  // - check for expected outcome -
  //   - animal with empty stomach has now got food
  //   - animal with food in stomach unchanged




}