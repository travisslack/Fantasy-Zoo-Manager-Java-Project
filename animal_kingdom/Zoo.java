package animal_kingdom;
import java.util.ArrayList;

public class Zoo {
  private String name;
  private ArrayList<Enclosure> enclosure;

  public Zoo(String name) {
    this.name = name;
    this.enclosure = new ArrayList<Enclosure>();
  }

  public String getName() {
    return this.name;
  }

  public int enclosureCount() {
    return this.enclosure.size();
  }

  public void addToZoo(Enclosure e) {
    this.enclosure.add(e);
  }




}
