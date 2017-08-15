import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class SnakeEnclosureTest {
  SnakeEnclosure snakeEnclosure;
  Snake snake;
  Monkey monkey;

  @Before
  public void before() {
    snakeEnclosure = new SnakeEnclosure("Snake Enclosure", 10);
    snake = new Snake("Kaa", "Green", 6);
    monkey = new Monkey("James", "Red", 7);
  }

  @Test 
  public void hasName() {
    assertEquals("Snake Enclosure", snakeEnclosure.getName());
  }

  @Test
  public void snakeEnclosureStartsEmpty() {
    assertEquals(0, snakeEnclosure.animalCount());
  }
}