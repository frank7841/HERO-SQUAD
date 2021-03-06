import java.util.ArrayList;
public class MyHero {
    private String name;
    private int age;
    private String specialPower;
    private String weakness;
    private static ArrayList<MyHero> instances = new ArrayList<>();
    private int id;

    public MyHero(String name, int age, String specialPower, String weakness) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
    }

    public String getName() { return name; }

    public int getAge() {return age; }

    public String getSpecialPower() {return specialPower;}

    public String getWeakness() {return weakness;}

    public int getId() {return id;}

    public static ArrayList<MyHero> getAll() {return instances; }

    public static MyHero findById(int id) { return instances.get(id - 1);}// since Array Index starts from 0
}
