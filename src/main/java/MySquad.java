import java.util.ArrayList;
public class MySquad {
    private final int size;
    private final String squadName;
    private final String purpose;
    private static ArrayList<MySquad> instances = new ArrayList<MySquad>();
    private int id;

    public MySquad(int size, String squadName, String purpose){
        this.size=size;
        this.squadName=squadName;
        this.purpose =purpose;
        instances.add(this);
        this.id = instances.size();
    }

    public int getSize() {return size; }

}
