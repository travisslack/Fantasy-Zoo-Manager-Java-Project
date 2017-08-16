import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class SnakeEnclosureTest {
  SnakeEnclosure edinburghSnakeEnclosure;
  Snake snake;
  Monkey monkey;

  @Before
  public void before() {
    edinburghSnakeEnclosure = new SnakeEnclosure("Edinburgh Snake Enclosure", 10);
    snake = new Snake("Kaa", "Green", 6, 100.00);
    monkey = new Monkey("Julius", "Brown", 4, 200.00);
  }

  @Test 
  public void hasName() {
    assertEquals("Edinburgh Snake Enclosure", edinburghSnakeEnclosure.getName());
  }

  @Test
  public void snakeEnclosureStartsEmpty() {
    assertEquals(0, edinburghSnakeEnclosure.animalCount());
  }
}