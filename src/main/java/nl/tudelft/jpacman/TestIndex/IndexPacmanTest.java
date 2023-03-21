package nl.tudelft.jpacman.TestIndex;

import nl.tudelft.jpacman.ui.IndexPacman;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndexPacmanTest {
    private IndexPacman indexPacman;

    @BeforeEach
    public void setUp() {
        indexPacman = new IndexPacman();
    }

    @Test
    @DisplayName("TS001 - TC01")
    public void testSetLevelNameMapZero() {
        indexPacman.setLevelName("/map0.txt");
        assertEquals("/map0.txt", indexPacman.getLevelName());
    }

    @Test
    @DisplayName("TS001 - TC02")
    public void testSetLevelNameMapOne() {
        indexPacman.setLevelName("/map1.txt");
        assertEquals("/map1.txt", indexPacman.getLevelName());
    }

    @Test
    @DisplayName("TS001 - TC03")
    public void testSetLevelNameMapTwo() {
        indexPacman.setLevelName("/map2.txt");
        assertEquals("/map2.txt", indexPacman.getLevelName());
    }

    @Test
    @DisplayName("TS001 - TC04")
    public void testSetLevelNameMapThree() {
        indexPacman.setLevelName("/map3.txt");
        assertEquals("/map3.txt", indexPacman.getLevelName());
    }

    @Test
    @DisplayName("TS001 - TC05")
    public void testSetLevelNameMapFour() {
        indexPacman.setLevelName("/map4.txt");
        assertEquals("/map4.txt", indexPacman.getLevelName());
    }

    @Test
    @DisplayName("TS002 - TC01")
    public void testSetCurrentThemeZeroTime() {
        indexPacman.setCurrentTheme("A");
        assertEquals("A", indexPacman.getCurrentTheme());
    }

    @Test
    @DisplayName("TS002 - TC02")
    public void testSetCurrentThemeOneTime() {
        indexPacman.setCurrentTheme("B");
        assertEquals("B", indexPacman.getCurrentTheme());
    }

    @Test
    @DisplayName("TS002 - TC03")
    public void testSetCurrentThemeTwoTime() {
        indexPacman.setCurrentTheme("C");
        assertEquals("C", indexPacman.getCurrentTheme());
    }

    @Test
    @DisplayName("TS002 - TC04")
    public void testSetCurrentThemeThreeTime() {
        indexPacman.setCurrentTheme("D");
        assertEquals("D", indexPacman.getCurrentTheme());
    }

    @Test
    @DisplayName("TS002 - TC05")
    public void testSetCurrentThemeFourTime() {
        indexPacman.setCurrentTheme("A");
        assertEquals("A", indexPacman.getCurrentTheme());
    }

}
