package animal_kingdom;
import java.util.ArrayList;

public abstract class Enclosure {
  protected String name;
  protected int size;

  public Enclosure(String name, int size) {
    this.name = name;
    this.size = size;
  }

  public String getName() {
    return this.name;
  }

  public int size() {
    return this.size;
  }
}