package stockList.instruments;

import stockList.Instrument;
import stockMods.InstrumentGroup;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String type, int numberOfStrings, String manufacturer, String model, int packageSize, double cost, InstrumentGroup grouping) {
        super(type, manufacturer, model, packageSize, cost, grouping, cost * 1.3);
        this.numberOfStrings = numberOfStrings;
    }


    public String play() {
        return "ka-ding-ding-quaDINGGGgg";
    }

    public double sellPrice() {
        return this.getRrp();
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
