import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable {
    private String name;
    private int hp;
    private String profession;
    private String weapon;
    private int exp;

    public Player(String name, int hp, String profession) {
        this.name = name;
        this.hp = hp;
        this.profession = profession;
        this.weapon = "Sword";
        this.exp = 0;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add("" + hp);
        list.add(profession);
        list.add(weapon);
        list.add("" + exp);
        return list;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hp = Integer.parseInt(savedValues.get(1));
            this.profession = savedValues.get(2);
            this.weapon = savedValues.get(3);
            this.exp = Integer.parseInt(savedValues.get(4));

        }
    }

    public String toString() {
        return "Name: " + name + " Hp: " + hp + " Profession: " + profession + " Weapon: " + weapon + " Exp: " + exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
