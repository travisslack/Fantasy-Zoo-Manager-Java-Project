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

}