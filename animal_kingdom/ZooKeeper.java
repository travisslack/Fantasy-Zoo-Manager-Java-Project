package animal_kingdom;
import java.util.*;

public class ZooKeeper {
  private String name;


  public ZooKeeper(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void addToEnclosure(Animal animal, Enclosure enclosure) {
     enclosure.addToEnclosure(animal);
  }
}

