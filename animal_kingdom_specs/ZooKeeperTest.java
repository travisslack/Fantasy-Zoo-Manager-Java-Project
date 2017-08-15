import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;
import behaviours.*;

public class ZooKeeperTest {
  ZooKeeper edinburghZooKeeper;
  Monkey monkey;
  Snake snake;
  MonkeyEnclosure edinburghMonkeyEnclosure;
  SnakeEnclosure edinburghSnakeEnclosure;
  Banana banana;
  Nut nut;

  @Before
  public void before() {
    edinburghZooKeeper = new ZooKeeper("David");
    monkey = new Monkey("Julius", "Brown", 4);
    snake = new Snake("Kaa", "Green", 6);
    edinburghMonkeyEnclosure = new MonkeyEnclosure("Edinburgh Monkey Enclosure", 15);
    edinburghSnakeEnclosure = new SnakeEnclosure("Edinburgh Snake Enclosure", 10);
    banana = new Banana();
    nut = new Nut();
  }

  @Test
  public void hasName() {
    assertEquals("David", edinburghZooKeeper.getName());
  }

  @Test
  public void canAddMonkeyToMonkeyEnclosure(){
    edinburghZooKeeper.addToEnclosure(monkey, edinburghMonkeyEnclosure);
    assertEquals(1, edinburghMonkeyEnclosure.animalCount());
  }

  @Test
  public void canAddSnakeToSnakeEnclosure(){
    edinburghZooKeeper.addToEnclosure(snake, edinburghSnakeEnclosure);
    assertEquals(1, edinburghSnakeEnclosure.animalCount());
  }

  @Test
  public void canAddMonkeyToSnakeEnclosure() {
    edinburghSnakeEnclosure.addToEnclosure(monkey);
    assertEquals(1, edinburghSnakeEnclosure.animalCount());
  }

  @Test
  public void canRemoveMonkeyFromMonkeyEnclosure() {
    edinburghZooKeeper.addToEnclosure(monkey, edinburghMonkeyEnclosure);
    edinburghZooKeeper.removeFromEnclosure(monkey, edinburghMonkeyEnclosure);
    assertEquals(0, edinburghMonkeyEnclosure.animalCount());
  }

  @Test
  public void canRemoveSnakeFromSnakeEnclosure() {
    edinburghZooKeeper.addToEnclosure(snake, edinburghSnakeEnclosure);
    edinburghZooKeeper.removeFromEnclosure(snake, edinburghSnakeEnclosure);
    assertEquals(0, edinburghSnakeEnclosure.animalCount());
  }

  @Test
  public void canFeedBananaToMonkey() {
    edinburghZooKeeper.feedAnimal(banana, monkey);
    assertEquals(1, monkey.foodCount());
  }

  @Test
  public void canFeedNutToSnake() {
    edinburghZooKeeper.feedAnimal(nut, snake);
    assertEquals(1, snake.foodCount());
  }

  @Test
  public void canFeedMonkeyToSnake() {
    edinburghZooKeeper.addToEnclosure(monkey, edinburghSnakeEnclosure);
    edinburghZooKeeper.feedAnimal(monkey, snake);
    assertEquals(1, snake.foodCount());
  }

}