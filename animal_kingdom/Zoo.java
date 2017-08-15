package animal_kingdom;
import java.util.ArrayList;

public class Zoo {
  private String name;
  private ArrayList<Enclosure> enclosure;
  private ArrayList<ZooKeeper> zooKeepers;

  public Zoo(String name) {
    this.name = name;
    this.enclosure = new ArrayList<Enclosure>();
    this.zooKeepers = new ArrayList<ZooKeeper>();
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










}
