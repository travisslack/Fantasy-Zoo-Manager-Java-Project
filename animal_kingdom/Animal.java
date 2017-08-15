package animal_kingdom;
import behaviours.*;

public abstract class Animal {
  protected String name;
  protected String colour;
  protected int age;

  public Animal(String name, String colour, int age) {
    this.name = name;
    this.colour = colour;
    this.age = age;
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