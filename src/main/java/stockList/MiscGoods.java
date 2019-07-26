package stockList;

public class MiscGoods extends Stock {


    public MiscGoods(String type, String manufacturer, int packageSize, double cost) {
        super(type, manufacturer, packageSize, cost, cost * 2);
    }
}
