import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class MonkeyTest {
  Monkey monkey;

  @Before
  public void before() {
    monkey = new Monkey("Julius", "brown", 4);
  }

  @Test
  public void hasName() {
  assertEquals("Julius", monkey.getName());
  }

}
