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
        assertEquals("Justice League", squad.getSquadName());
    }
    @Test
    public void getsSquadPurpose() {
        MySquad squad = new MySquad(10,"Justice League", "Fight Crime");
        assertEquals("Fight Crime", squad.getPurpose());
    }
    @Test
    public void getsId() {
        MySquad squad = new MySquad(10,"Justice League", "Fight Crime");
        assertEquals(1, squad.getId());
    }
    @Test
    public void allSquadsContainSquads_true() {
        MySquad group1 = new MySquad(10,"Justice League", "Fight Crime");
        MySquad group2 = new MySquad(5, "Lanterns", "Destroy Joker");
        assertEquals(true, MySquad.getAll().contains(group1));
        assertEquals(true, MySquad.getAll().contains(group2));
    }
    @Test
    public void allSquadsAreCorrectlyreturned() {
        MySquad group1 = new MySquad(10, "Justice League", "Fight Crime");
        MySquad group2 = new MySquad(5, "Night Savers", "Destroy Joker");
        assertEquals(2, MySquad.getAll().size());
    }
    @Test
    public void findReturnsCorrectHeroWhenMoreThanOneHeroExists() {
        MySquad group2 = new MySquad(5, "Night Savers", "Fight corruption");
        assertEquals(1, MySquad.findById(group2.getId()).getId());
    }

}