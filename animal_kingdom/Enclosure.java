package animal_kingdom;
import java.util.ArrayList;

public abstract class Enclosure {
  protected String name;
  protected int size;
  protected ArrayList<Animal> animals;

  public Enclosure(String name, int size) {
    this.name = name;
    this.size = size;
    this.animals = new ArrayList<Animal>(); 
  }

  public String getName() {
    return this.name;
  }

  public int size() {
    return this.size;
  }

  public int animalCount() {
    return this.animals.size();
  }

  public void addToEnclosure(Animal a) {
    this.animals.add(a);
  }

  public void removeFromEnclosure(Animal a) {
    this.animals.remove(a);
  }

}