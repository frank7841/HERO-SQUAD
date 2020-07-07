import java.util.ArrayList;
public class MyHero {
    private String name;
    private int age;
    private String specialPower;
    private String weakness;
    private static ArrayList<MyHero> instances = new ArrayList<>();

    public MyHero(String name,int age, String specialPower, String weakness){
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness=weakness;
        instances.add(this);
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public String getSpecialPower() {return specialPower; }

}
