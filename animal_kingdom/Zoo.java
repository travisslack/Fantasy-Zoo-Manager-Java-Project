package animal_kingdom;
import java.util.ArrayList;

public class Zoo {
  private String name;
  private int capacity;
  private double entryPrice;
  private double totalIncome;
  private double zooBudget;
  private ArrayList<Enclosure> enclosure;
  private ArrayList<ZooKeeper> zooKeepers;
  private ArrayList<Visitor> visitors;
  private ArrayList<Animal> animals;

  public Zoo(String name, int capacity, double entryPrice, double totalIncome, double zooBudget) {
    this.name = name;
    this.capacity = capacity;
    this.entryPrice = entryPrice;
    this.totalIncome = totalIncome;
    this.zooBudget = zooBudget;
    this.enclosure = new ArrayList<Enclosure>();
    this.zooKeepers = new ArrayList<ZooKeeper>();
    this.visitors = new ArrayList<Visitor>();
    this.animals = new ArrayList<Animal>();
  }

  public String getName() {
    return this.name;
  }

  public int enclosureCount() {
    return this.enclosure.size();
  }

  public double entryPriceAmount() {
    return this.entryPrice;
  }

  public double zooTotalIncome() {
    return this.totalIncome;
  }

  public double zooTotalBudget() {
    return this.zooBudget;
  }

// overloading 1
  public void addToZoo(Enclosure e) {
    this.enclosure.add(e);
  }

  public void removeFromZoo(Enclosure e) {
    this.enclosure.remove(e);
  }

  public int zooKeeperCount() {
    return this.zooKeepers.size();
  }
// overloading 2
  public void addToZoo(ZooKeeper zk) {
    this.zooKeepers.add(zk);
  }
// overloading 3
  public void addToZoo(Animal a) {
    this.animals.add(a);
  }

  public int animalCount() {
    return this.animals.size();
  }

  public void removeFromZoo(Animal a) {
    this.animals.remove(a);
  }

  public int visitorCount() {
    return this.visitors.size();
  }

  public int getCapacity() {
    return this.capacity;
  }
// overloading 4
  public void addToZoo(Visitor v) {
    v.makePayment(this.entryPrice);
    this.visitors.add(v);
  }

  public boolean canAdmitVisitor() {
    if (this.visitors.size() < capacity) {
      return true;
    } else {
      return false;
    }
  }

  public boolean admitVisitor(Visitor visitor){
    if (this.canAdmitVisitor() && (visitor.hasFunds (this.entryPrice)) == true ){
        addToZoo(visitor);
        addMoneyToIncome(entryPrice);
        return true;
      } else {
      return false;
    } 
  }

  public void addMoneyToIncome(double amount) {
   totalIncome += amount;
  }


  public boolean canTransferAnimal(Animal animal) {
    if (this.zooBudget > animal.transferPrice) {
      return true;
    } else {
      return false;
    }
  }

  public void transferAnimalToOtherZoo(Animal animal, Zoo zooToTransferTo) {
    if (zooToTransferTo.zooBudget > animal.transferPrice) {
      zooToTransferTo.addToZoo(animal);
      this.removeFromZoo(animal);
      this.addMoneyToIncome(animal.transferPrice);
    }
  }












}











