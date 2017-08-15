import org.junit.*;
import animal_kingdom.*;

public class VisitorTest {
  Visitor visitor;

  @Before
  public void before() {
    visitor = new Visitor("Jack", 65.00)
  }

  @Test
  public void hasName() {
    assertEquals("Jack", visitor.getName());
  }
}