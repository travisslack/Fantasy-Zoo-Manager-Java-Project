package animal_kingdom;
import java.util.ArrayList;

public abstract class Enclosure {
  protected String name;
  protected int capacity;

  public Enclosure(String name, int capacity) {
    this.name = name;
    this.capacity = capacity;
  }

  
}