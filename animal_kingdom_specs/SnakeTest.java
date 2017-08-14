import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class SnakeTest {
  Snake snake;

  @Before
  public void before() {
    snake = new Snake("Kaa", "Green", 6);
  }

  @Test
  public void hasName() {
    assertEquals("Kaa", snake.getName());
  }

  

}