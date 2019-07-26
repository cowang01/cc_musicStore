package stockList.instruments;

import stockList.Instrument;
import stockMods.InstrumentGroup;

public class Piano extends Instrument {

    private boolean seat;


    public Piano(String type, String manufacturer, String model, int packageSize, double cost, InstrumentGroup grouping, boolean seat) {
        super(type, manufacturer, model, packageSize, cost, grouping, cost * 1.8);
        this.seat = seat;
    }

    public String play() {
        return "Ling-Ling-LinG-ling";
    }

    public double sellPrice() {
        return this.getRrp();
    }

    public boolean isSeat() {
        return seat;
    }
}
