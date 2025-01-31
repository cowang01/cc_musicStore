import org.junit.Before;
import org.junit.Test;
import stockList.instruments.Guitar;
import stockMods.InstrumentGroup;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setup(){
        guitar = new Guitar("Electric", 6, "CodeClan", "G13", 23, 140.00, InstrumentGroup.string);

    }



    @Test
    public void canhaveType(){
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void canHaveManufacturer() {
        assertEquals("CodeClan", guitar.getManufacturer());
    }

    @Test
    public void canHaveModel() {
        assertEquals("G13", guitar.getModel());
    }

    @Test
    public void canHavePackageSize() {
        assertEquals(23, guitar.getPackageSize());
    }

    @Test
    public void canHaveCost() {
        assertEquals(140.00, guitar.getCost(), 0.1);
    }

    @Test
    public void canCountNumberOFStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canHaveGrouping() {
        assertEquals(InstrumentGroup.string, guitar.getGrouping());
    }

    @Test
    public void canPlayGuitar() {
        assertEquals("ka-ding-ding-quaDINGGGgg", guitar.play());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(42.0, guitar.calculateMarkup(), 0.1);
    }

    @Test
    public void canReturnSalePrice() {
        assertEquals(182, guitar.sellPrice(), 0.1);
    }

    @Test
    public void canUpdateSalePrice() {
        guitar.setRrp(200);
        assertEquals(200, guitar.sellPrice(), 0.1);
    }

}
