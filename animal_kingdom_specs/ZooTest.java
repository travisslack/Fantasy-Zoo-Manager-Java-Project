import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class ZooTest {
  Zoo zoo;
  Enclosure tigerEnclosure;

  @Before
  public void before() {
    zoo = new Zoo("Edinburgh Zoo");
    tigerEnclosure = new TigerEnclosure("Tiger Enclosure", 10);

  }

  @Test
  public void hasName() {
    assertEquals("Edinburgh Zoo", zoo.getName());
  }

  @Test
  public void zooStartsEmpty() {
    assertEquals(0, zoo.enclosureCount());
  }


}