import java.util.ArrayList;
import java.util.List;

public class Monster implements Saveable {
    private String name;
    private int level;
    private int strength;

    public Monster(String name, int level, int strength) {
        this.name = name;
        this.level = level;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(""+level);
        list.add(""+strength);
        return list;
    }

    @Override
    public void read(List<String> list) {
        this.name = list.get(0);
        this.level = Integer.parseInt(list.get(1));
        this.strength = Integer.parseInt(list.get(2));
    }

    public String toString(){
        return "Name: " + name + " Level: " + level + " Strength: " + strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}

