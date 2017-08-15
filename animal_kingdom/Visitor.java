package animal_kingdom;

public class Visitor {
  private String name;
  private double budget;

  public Visitor(String name, double Budget) {
    this.name = name;
    this.budget = budget;
  }

  public String getName() {
    return this.name;
  }
}