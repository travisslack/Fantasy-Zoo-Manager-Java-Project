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

  public Enclosure findEnclosureWithSpace(ArrayList<Enclosure> enclosures) {
    for (int index = 0; index < enclosures.size(); index++){
      Enclosure enclosure = enclosures.get(index);
      if (enclosure.animalCount() < enclosure.size()){
        return enclosure;
      }
    }
    return null;
  }

  public void houseAnimal(Animal animal, ArrayList<Enclosure> enclosures){
    Enclosure foundEnclosure = this.findEnclosureWithSpace(enclosures);
    if (foundEnclosure != null) {
      foundEnclosure.addToEnclosure(animal);
    }
  }

  
}

