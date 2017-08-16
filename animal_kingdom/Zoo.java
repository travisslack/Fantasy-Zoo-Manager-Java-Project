package animal_kingdom;
import java.util.ArrayList;

public class Zoo {
  private String name;
  public int capacity;
  private ArrayList<Enclosure> enclosure;
  private ArrayList<ZooKeeper> zooKeepers;
  private ArrayList<Visitor> visitors;

  public Zoo(String name, int capacity) {
    this.name = name;
    this.capacity = capacity;
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

  public int visitorCount() {
    return this.visitors.size();
  }

  public int getCapacity() {
    return this.capacity;
  }

  public void addToZoo(Visitor v) {
    this.visitors.add(v);
  }

  public Boolean canAdmitVisitor() {
    if (this.visitors.size() < capacity) {
      return true;
    } else {
      return false;
    }
  }

  public void admitVisitor(Visitor visitor){
    if (this.canAdmitVisitor() == true){
      addToZoo(visitor);
    }
  }

}











