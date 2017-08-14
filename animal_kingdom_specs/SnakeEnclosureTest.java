import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class SnakeEnclosureTest {
  SnakeEnclosure snakeEnclosure;
  Snake snake;

  @Before
  public void before() {
    snakeEnclosure = new SnakeEnclosure("Snake Enclosure", 10);
    snake = new Snake("Kaa", "Green", 6);
  }

  @Test 
  public void hasName() {
    assertEquals("Snake Enclosure", snakeEnclosure.getName());
  }

  @Test
  public void snakeEnclosureStartsEmpty() {
    assertEquals(0, snakeEnclosure.animalCount());
  }

  @Test
  public void canAddSnakeToSnakeEnclosure() {
    snakeEnclosure.addToEnclosure(snake);
    assertEquals(1, snakeEnclosure.animalCount());
  }

  @Test
  public void canRemoveSnakeFromSnakeEnclosure() {
    snakeEnclosure.addToEnclosure(snake);
    snakeEnclosure.removeFromEnclosure(snake);
    assertEquals(0, snakeEnclosure.animalCount());
  }





}