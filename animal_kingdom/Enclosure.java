package animal_kingdom;
import java.util.ArrayList;

public abstract class Enclosure {
  protected String name;
  protected int size;
  protected ArrayList<Animal> animal;

  public Enclosure(String name, int size) {
    this.name = name;
    this.size = size;
    this.animal = new ArrayList<Animal>(); 
  }

  public String getName() {
    return this.name;
  }

  public int size() {
    return this.size;
  }

}