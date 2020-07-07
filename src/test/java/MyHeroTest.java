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
        assertEquals("Batman", hero.getName());
    }
    @Test
    public void getAgeInput() {
        MyHero hero = new MyHero("Batman", 27, "I am Batman", "Nothing");
        assertEquals("Batman", hero.getAge());
    }
    @Test
    public void getSpecialPowerInput() {
        MyHero hero = new MyHero("Batman", 27, "I am Batman", "Nothing");
        assertEquals("Batman", hero.getSpecialPower());
    }
    @Test
    public void getWeaknessInput() {
        MyHero hero = new MyHero("Batman", 27, "I am Batman", "Nothing");
        assertEquals("Batman", hero.getWeakness());
    }
    @Test
    public void getInstaceId() {
        MyHero hero = new MyHero("Batman", 27, "I am Batman", "Nothing");
        assertEquals(1, hero.getId());
    }
    @Test
    public void allHeroesContainHeroes_true() {
        MyHero heroflash = new MyHero("Flash", 23, "Speed", "Love");
        MyHero herobats = new MyHero("Batman", 26, "I am Batman", "Light");
        assertEquals(true, MyHero.getAll().contains(heroflash));
        assertEquals(true, MyHero.getAll().contains(herobats));
    }
    @Test
    public void allHerosAreCorrectlyreturned() {
        MyHero heroflash = new MyHero("Flash", 23, "Speed", "Love");
        MyHero herobats = new MyHero("Batman", 26, "I am Batman", "Light");
        assertEquals(2, MyHero.getAll().size());
    }
}