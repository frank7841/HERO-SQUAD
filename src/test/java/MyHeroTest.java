import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyHeroTest  {

    @Test
    public void checkingWhetherItInstantiatesProperly() {
        MyHero hero = new MyHero("Batman", 27, "I am Batman", "Nothing");
        assertEquals(true, hero instanceof MyHero);
    }
    @Test
    public void getsNameInput() {
        MyHero hero = new MyHero("Batman", 27, "I am Batman", "Nothing");
        assertEquals("Superman", hero.getName());
    }
    @Test
    public void getAgeInput() {
        MyHero hero = new MyHero("Batman", 27, "I am Batman", "Nothing");
        assertEquals("Superman", hero.getAge());
    }
    @Test
    public void getSpecialPowerInput() {
        MyHero hero = new MyHero("Batman", 27, "I am Batman", "Nothing");
        assertEquals("Superman", hero.getSpecialPower());
    }
    @Test
    public void getWeaknessInput() {
        MyHero hero = new MyHero("Batman", 27, "I am Batman", "Nothing");
        assertEquals("Superman", hero.getWeakness());
    }
}