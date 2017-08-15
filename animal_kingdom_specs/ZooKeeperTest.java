import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class ZooKeeperTest {
  ZooKeeper zooKeeper;
  Monkey monkey;
  Snake snake;
  MonkeyEnclosure monkeyEnclosure;
  SnakeEnclosure snakeEnclosure;
  Banana banana;
  Nut nut;
  
  @Before
  public void before() {
    zooKeeper = new ZooKeeper("David");
    monkeyEnclosure = new MonkeyEnclosure("Monkey Enclosure", 15);
    snakeEnclosure = new SnakeEnclosure("Snake Enclosure", 10);
    monkey = new Monkey("Julius", "Brown", 4);
    snake = new Snake("Kaa", "Green", 6);
    banana = new Banana();
    nut = new Nut();
  }

  @Test
  public void hasName() {
    assertEquals("David", zooKeeper.getName());
  }

  @Test
  public void canAddMonkeyToEnclosure(){
    zooKeeper.addToEnclosure(monkey, monkeyEnclosure);
    assertEquals(1, monkeyEnclosure.animalCount());
  }

  @Test
  public void canAddSnakeToEnclosure(){
    zooKeeper.addToEnclosure(snake, snakeEnclosure);
    assertEquals(1, snakeEnclosure.animalCount());
  }

  @Test
  public void canRemoveMonkeyFromEnclosure() {
    zooKeeper.addToEnclosure(monkey, monkeyEnclosure);
    zooKeeper.removeFromEnclosure(monkey, monkeyEnclosure);
    assertEquals(0, monkeyEnclosure.animalCount());
  }

  @Test
  public void canRemoveSnakeFromEnclosure() {
    zooKeeper.addToEnclosure(snake, snakeEnclosure);
    zooKeeper.removeFromEnclosure(snake, snakeEnclosure);
    assertEquals(0, snakeEnclosure.animalCount());
  }

  @Test
  public void addFoodToMonkey() {
    zooKeeper.feedAnimal(banana, monkey);
    assertEquals(1, monkey.foodCount());
  }

  @Test
  public void addFoodNutToSnake() {
    zooKeeper.feedAnimal(nut, snake);
    assertEquals(1, snake.foodCount());
  }

  @Test
  public void addFoodMonkeyToSnake() {
    zooKeeper.feedAnimal(monkey, snake);
    assertEquals(1, snake.foodCount());
  }





  // - add 2nd animal to enclosure
  // - feed one animal
  // - call zooKeeper.feedHungryAnimals(enclosure)
  // - check for expected outcome -
  //   - animal with empty stomach has now got food
  //   - animal with food in stomach unchanged




}