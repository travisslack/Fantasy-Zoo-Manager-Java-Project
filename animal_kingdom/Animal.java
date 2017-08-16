package animal_kingdom;
import behaviours.*;

public abstract class Animal {
  protected String name;
  protected String colour;
  protected int age;
  protected double transferPrice;

  public Animal(String name, String colour, int age, double transferPrice) {
    this.name = name;
    this.colour = colour;
    this.age = age;
    this.transferPrice = transferPrice;
  }

  public String getName() {
    return this.name;
  }

  public String getColour() {
    return this.colour;
  }

  public int getAge() {
    return this.age;
  }

  public abstract void eat(Edible food);

}
