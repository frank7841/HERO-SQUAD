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
        MySquad squad = new MySquad(10,"Justice League", "Protect citizens");
        assertEquals(10, squad.getSize());
    }
}