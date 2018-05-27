import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    private static Formatter formatter;
    private static Scanner scanner;

    public static void main(String[] args) {
        Player player = new Player("Lutek", 100, "Warrior");
        Monster monster = new Monster("Werewolf", 15, 45);
        save(player, player.getName());
        save(monster, monster.getName());
        player.setExp(100);
        load(player, player.getName());
        System.out.println(player.getExp());

    }

    private static void save(Saveable entity, String name){
        try {
            formatter = new Formatter(new File(name + ".txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(int i=0; i<entity.write().size(); i++){
            formatter.format("%s%n", entity.write().get(i));
        }
        formatter.close();
    }

    private static void load(Saveable entity, String name){
        try {
            scanner = new Scanner(new File(name+".txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Can't load file " + name + ".txt");
        }

        ArrayList<String> values = new ArrayList<>();

        while (scanner.hasNext()){
            values.add(scanner.next());
        }

        entity.read(values);
    }
}
