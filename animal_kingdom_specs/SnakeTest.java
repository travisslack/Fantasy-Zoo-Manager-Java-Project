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

  @Test
  public void hasColour() {
    assertEquals("Green", snake.getColour());
  }

  @Test 
  public void hasAge() {
    assertEquals(6, snake.getAge());
  }

  @Test
  public void stomachStartsEmpty() {
    assertEquals(0, snake.foodCount());
  }



}