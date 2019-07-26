package stockList;

import stockMods.InstrumentGroup;

public class Guitar extends Instrument {


    public Guitar(String type, String manufacturer, String model, int packageSize, double cost, InstrumentGroup grouping) {
        super(type, manufacturer, model, packageSize, cost, grouping, cost * 1.3);
    }


    public String play() {
        return "ka-ding-ding-quaDINGGGgg";
    }

    public double sellPrice() {
        return this.getRrp();
    }


}
