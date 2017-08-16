package animal_kingdom;

public class Visitor {
  private String name;
  private double budget;

  public Visitor(String name, double budget) {
    this.name = name;
    this.budget = budget;
  }

  public String getName() {
    return this.name;
  }

  public double getBudget() {
    return this.budget;
  }

  public boolean hasFunds(double entryPrice) {
    if (this.budget >= entryPrice){
      return true;
    } else{
      return false;
    }
  }

  public void makePayment(double amount) {
    this.budget -= amount;
  }
}