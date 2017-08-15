import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;
import behaviours.*;

public class MonkeyTest {
  Monkey monkey;
  Edible nut;
  Edible banana;

  @Before
  public void before() {
    monkey = new Monkey("Julius", "Brown", 4);
    nut = new Nut();
    banana = new Banana();
  }

  @Test
  public void hasName() {
  assertEquals("Julius", monkey.getName());
  }

  @Test 
  public void hasColour() {
    assertEquals("Brown", monkey.getColour());
  }

  @Test 
  public void hasAge() {
    assertEquals(4, monkey.getAge());
  }

  @Test
  public void stomachStartsEmpty() {
    assertEquals(0, monkey.foodCount());
  }

  @Test
  public void canEat() {
    monkey.eat(nut);
    monkey.eat(banana);
    assertEquals(2, monkey.foodCount());
  }

}
