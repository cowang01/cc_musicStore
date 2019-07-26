import org.junit.Before;
import org.junit.Test;
import stockList.miscellaneous.MiscGoods;

import static junit.framework.TestCase.assertEquals;

public class MiscGoodsTest {

    MiscGoods sheetMusic;

    @Before
    public void setUp() throws Exception {
        sheetMusic = new MiscGoods("Sheet Music", "G13 Sings", "CodeClan", 20, 20.00);
    }


    @Test
    public void canHaveType() {
        assertEquals("Sheet Music", sheetMusic.getType());
    }

    @Test
    public void canHaveTitle() {
        assertEquals("G13 Sings", sheetMusic.getTitle());
    }

    @Test
    public void canUpdateSalePrice() {
        sheetMusic.setRrp(80.00);
        assertEquals(80.00, sheetMusic.sellPrice());
    }
}
