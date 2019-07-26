package stockList.miscellaneous;

import stockList.Stock;
import stockMods.ISell;

public class MiscGoods extends Stock implements ISell {

    private String title;

    public MiscGoods(String type, String title, String manufacturer, int packageSize, double cost) {
        super(type, manufacturer, packageSize, cost, cost * 2);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double sellPrice() {
        return getRrp();
    }
}
