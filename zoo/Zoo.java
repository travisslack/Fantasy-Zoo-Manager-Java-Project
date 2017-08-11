package fantasy_zoo;
import java.util.ArrayList;

public class Zoo {
  private String name;
  private Zookeeper zookeeper;
  private ArrayList<Enclosure> enclosures;

  public Zoo(String name) {
    this.name = name;
    this.enclosures = new ArrayList<Enclosure>();
  }
}
