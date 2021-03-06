package animal_kingdom;
import java.util.ArrayList;
import behaviours.*;

public class Snake extends Animal {
  private ArrayList<Edible> stomach;

  public Snake(String name, String colour, int age, double transferPrice) {
    super(name, colour, age, transferPrice);
    this.stomach = new ArrayList<Edible>();
  }

  public int foodCount() {
    return this.stomach.size();
  }

  public void eat(Edible food) {
    this.stomach.add(food);
  }





}