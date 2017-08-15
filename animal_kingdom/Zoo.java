package animal_kingdom;
import java.util.ArrayList;

public class Zoo {
  private String name;
  private ArrayList<Enclosure> enclosure;
  private ArrayList<ZooKeeper> zooKeepers;
  private ArrayList<Visitor> visitors;

  public Zoo(String name, int capacity) {
    this.name = name;
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

  public int getCapacity() {
    return this.capacity;
  }

  public boolean admitVisitor(Visitor v) {
    // if the length of the arraylist of visitors
    // is less than the capacity
    // allow admittance
    // else return false
  }










}
