package stockList;

import java.time.LocalDate;

public abstract class Stock {

    private String type;
    private int packageSize;
    private String manufacturer;
    private double cost;
    private double rrp;
    private LocalDate purchaseDate;
    private LocalDate soldDate;

    public Stock(String type, String manufacturer,  int packageSize, double cost, double rrp) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.packageSize = packageSize;
        this.cost = cost;
        this.rrp = rrp;
        this.purchaseDate = LocalDate.now();
        this.soldDate = null;
    }



    public String getType() {
        return type;
    }

    public int getPackageSize() {
        return packageSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getCost() {
        return cost;
    }

    public double getRrp() {
        return rrp;
    }

    public void setPackageSize(int packageSize) {
        this.packageSize = packageSize;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setRrp(double rrp) {
        this.rrp = rrp;
    }

    public double calculateMarkup() {
        return getRrp() - getCost();
    }

    public void setSoldDate(LocalDate soldDate) {
        this.soldDate = soldDate;
    }
}
