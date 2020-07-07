import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyHeroTest extends TestCase {

    @Test
    public void checkingWhetherItInstantiatesProperly() {
        MyHero hero = new MyHero("Batman", 27, "I am Batman", "Nothing");
        assertEquals(true, hero instanceof MyHero);
    }
}