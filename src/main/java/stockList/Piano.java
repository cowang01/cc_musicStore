package stockList;

import stockMods.InstrumentGroup;

public class Piano extends Instrument {


    public Piano(String type, String manufacturer, String model, int packageSize, double cost, InstrumentGroup grouping) {
        super(type, manufacturer, model, packageSize, cost, grouping, cost * 1.8);
    }

    public String play() {
        return "Ling-Ling-LinG-ling";
    }

    public double sellPrice() {
        return this.getRrp();
    }
}
