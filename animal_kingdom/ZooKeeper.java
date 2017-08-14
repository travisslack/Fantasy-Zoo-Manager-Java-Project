package animal_kingdom;
import java.util.*;
import behaviours.*;

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

  public void removeFromEnclosure(Animal animal, Enclosure enclosure) {
    enclosure.removeFromEnclosure(animal);
  }

  public void feedAnimal(Edible food, Animal animal) {
    animal.eat(food);
  }
}

