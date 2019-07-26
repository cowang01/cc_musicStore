import org.junit.Before;
import org.junit.Test;
import stockList.instruments.Piano;
import stockMods.InstrumentGroup;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano("Grand", "CodeClan", "G13", 240, 2000.00, InstrumentGroup.percussion, true);
    }


    @Test
    public void canGetType() {
        assertEquals("Grand", piano.getType());
    }

    @Test
    public void canPlayPiano() {
        assertEquals("Ling-Ling-LinG-ling", piano.play());
    }

    @Test
    public void canHaveASeat() {
        assertEquals(true, piano.isSeat());
    }
}
