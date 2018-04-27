import java.util.Scanner;

public class Games extends StoreInventory {
    private String title;
    private double price;
    private String genra;
    private int stock;

    public Games(String title, double price, String genra, int stock) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.genra = genra;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice(){
        return price;
    }

    public String getGenra() {
        return genra;
    }

    public int getStock(){
        return stock;
    }

    public String getAll() {
        return (title + " " + price + " " + genra + " " + stock);
    }
}
