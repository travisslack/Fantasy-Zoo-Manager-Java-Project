package animal_kingdom;
import java.util.ArrayList;
import behaviours.*;

public class Monkey extends Animal implements Edible {
  private ArrayList<Edible> stomach;


  public Monkey(String name, String colour, int age) {
    super(name, colour, age);
    this.stomach = new ArrayList<Edible>();
  }

  public int foodCount() {
    return this.stomach.size();
  }

  public void eat(Edible food) {
    this.stomach.add(food);
  }





}