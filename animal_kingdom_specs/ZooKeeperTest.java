import static org.junit.Assert.*;
import org.junit.*;
import animal_kingdom.*;

public class ZooKeeperTest {
  ZooKeeper zooKeeper;

  @Before
  public void before() {
    zooKeeper = new ZooKeeper("David");

  }

  @Test
  public void hasName() {
    assertEquals("David", zooKeeper.getName());
  }
}