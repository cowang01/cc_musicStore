package stockList;

import stockMods.IPlay;
import stockMods.ISell;
import stockMods.InstrumentGroup;

public abstract class Instrument extends Stock implements IPlay, ISell {

    private InstrumentGroup grouping;
    private String model;


    public Instrument(String type, String manufacturer, String model, int packageSize, double cost, InstrumentGroup grouping, double rrp) {
        super(type, manufacturer, packageSize, cost, rrp);
        this.grouping = grouping;
        this.model = model;
    }


    public InstrumentGroup getGrouping() {
        return grouping;
    }

    public String getModel() {
        return model;
    }
}
