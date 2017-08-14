package animal_kingdom;
import java.util.ArrayList;
import behaviours.*;

public class Snake extends Animal {
  private ArrayList<Edible> stomach;

  public Snake(String name, String colour, int age) {
    super(name, colour, age);
    this.stomach = new ArrayList<Edible>();
  }

  


}