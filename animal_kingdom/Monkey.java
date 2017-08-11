package animal_kingdom;

public class Monkey extends Animal {

  public Monkey(String name, String colour, int age) {
    super(name, colour, age);
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



}