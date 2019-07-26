import operations.Shop;
import org.junit.Before;
import org.junit.Test;
import stockList.instruments.Guitar;
import stockMods.InstrumentGroup;

import static junit.framework.TestCase.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("CodeClan", 500.00);
        guitar = new Guitar("Acoustic", 6, "Yamaha", "Fender-Accu50", 50, 200.00, InstrumentGroup.string);
    }


    @Test
    public void canHaveAName() {
        assertEquals("CodeClan", shop.getName());
    }

    @Test
    public void canGetTotalBank() {
        assertEquals(500.00, shop.getBank(), 0.1);
    }

    @Test
    public void canReturnCountOfStock() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canReturnCountOfSold() {
        assertEquals(0, shop.countSold());
    }

    @Test
    public void canBuyAnItemToStock() {
        shop.purchaseToStock(guitar);
        assertEquals(1, shop.countStock());
        assertEquals(300.00, shop.getBank(), 0.1);
    }


    @Test
    public void canSellStockToCustomer() {
        shop.purchaseToStock(guitar);
        shop.sell(guitar);
        assertEquals(1, shop.countSold());
        assertEquals(0, shop.countStock());
        assertEquals(560.0, shop.getBank());
    }

    @Test
    public void canGetTotalStockValue() {
        shop.purchaseToStock(guitar);
        shop.purchaseToStock(guitar);
        assertEquals(520.0, shop.sellPrice());
    }


}
