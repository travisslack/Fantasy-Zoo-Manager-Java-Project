import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;
import behaviours.*;

public class SnakeTest {
  Snake snake;
  Edible nut;
  Edible banana;

  @Before
  public void before() {
    snake = new Snake("Kaa", "Green", 6);
    nut = new Nut();
    banana = new Banana();
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

  @Test
  public void canEat() {
    snake.eat(nut);
    snake.eat(banana);
    assertEquals(2, snake.foodCount());
  }



}