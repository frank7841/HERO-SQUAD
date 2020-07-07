import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MySquadTest  {
    @Test
    public void checkWheatherItInstantiatesProperly() {
        MySquad squad = new MySquad(10,"Justice League", "Fight Crime");
        assertEquals(true, squad instanceof MySquad);
    }
    @Test
    public void getsSquadSize() {
        MySquad squad = new MySquad(10,"Justice League", "Fight Crime");
        assertEquals(10, squad.getSize());
    }
    @Test
    public void getsSquadName() {
        MySquad squad = new MySquad(10,"Justice League", "Fight Crime");
        assertEquals(10, squad.getSquadName());
    }
    @Test
    public void getsSquadPurpose() {
        MySquad squad = new MySquad(10,"Justice League", "Fight Crime");
        assertEquals(10, squad.getPurpose());
    }
    @Test
    public void getsId() {
        MySquad squad = new MySquad(10,"Justice League", "Fight Crime");
        assertEquals(1, squad.getId());
    }
    @Test
    public void allSquadsContainSquads_true() {
        MySquad group1 = new MySquad(10,"Justice League", "Protect citizens");
        MySquad group2 = new MySquad(5, "Night Savers", "Fight corruption");
        assertEquals(true, MySquad.getAll().contains(group1));
        assertEquals(true, MySquad.getAll().contains(group2));
    }

}