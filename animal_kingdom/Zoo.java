package animal_kingdom;
import java.util.ArrayList;

public class Zoo {
  private String name;
  private int capacity;
  private double entryPrice;
  private double totalIncome;
  private ArrayList<Enclosure> enclosure;
  private ArrayList<ZooKeeper> zooKeepers;
  private ArrayList<Visitor> visitors;

  public Zoo(String name, int capacity, double entryPrice, double totalIncome) {
    this.name = name;
    this.capacity = capacity;
    this.entryPrice = entryPrice;
    this.totalIncome = totalIncome;
    this.enclosure = new ArrayList<Enclosure>();
    this.zooKeepers = new ArrayList<ZooKeeper>();
    this.visitors = new ArrayList<Visitor>();
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

  public void addToZoo(Enclosure e) {
    this.enclosure.add(e);
  }

  public void removeFromZoo(Enclosure e) {
    this.enclosure.remove(e);
  }

  public int zooKeeperCount() {
    return this.zooKeepers.size();
  }

  public void addToZoo(ZooKeeper zk) {
    this.zooKeepers.add(zk);
  }

  public int visitorCount() {
    return this.visitors.size();
  }

  public int getCapacity() {
    return this.capacity;
  }

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
   System.out.println(totalIncome);

  }




}











