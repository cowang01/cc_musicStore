package operations;

import stockList.Stock;
import stockList.instruments.Guitar;
import stockMods.ISell;

import java.time.LocalDate;
import java.util.ArrayList;

public class Shop implements ISell {

    private String name;
    private ArrayList<Stock> stock;
    private ArrayList<Stock> sold;
    private double bank;

    public Shop(String name, double bank) {
        this.name = name;
        this.stock = new ArrayList<Stock>();
        this.sold = new ArrayList<Stock>();
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Stock> getStock() {
        return stock;
    }

    public ArrayList<Stock> getSold() {
        return sold;
    }

    public double getBank() {
        return bank;
    }

    public void setStock(ArrayList<Stock> stock) {
        this.stock = stock;
    }


    public int countStock() {
        return this.stock.size();
    }

    public int countSold() {
        return this.sold.size();
    }

    public void purchaseToStock(Guitar guitar) {
        this.bank -= guitar.getCost();
        this.stock.add(guitar);
    }

    public void sell(Guitar guitar) {
        this.stock.remove(guitar);
        guitar.setSoldDate(LocalDate.now());
        this.sold.add(guitar);
        this.bank += guitar.sellPrice();
    }

    public double sellPrice() {
        double totalSales = 0.0;
        for (Stock unit: this.stock){
            totalSales += unit.getRrp();
        }
        return totalSales;
    }

    public double calculateMarkup() {
        double totalMarkup = 0.0;
        for (Stock unit: this.stock){
            totalMarkup += (unit.getRrp() - unit.getCost());
        }
        return totalMarkup;
    }
}
