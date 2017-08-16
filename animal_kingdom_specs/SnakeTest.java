import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;
import behaviours.*;

public class SnakeTest {
  Snake snake;
  Edible nut;
  Edible banana;
  Edible monkey;

  @Before
  public void before() {
    snake = new Snake("Kaa", "Green", 6, 100.00);
    nut = new Nut();
    banana = new Banana();
    monkey = new Monkey("Julius", "Brown", 4, 200.00);
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
  public void hasTransferPrice() {
    assertEquals(100.00, snake.getTransferPrice(), 0.01);
  }

  @Test
  public void stomachStartsEmpty() {
    assertEquals(0, snake.foodCount());
  }

  @Test
  public void canEat() {
    snake.eat(nut);
    snake.eat(banana);
    snake.eat(monkey);
    assertEquals(3, snake.foodCount());
  }



}