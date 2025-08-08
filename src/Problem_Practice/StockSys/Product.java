package Problem_Practice.StockSys;


public class Product {
    private String name;
    private int price,stock;

    public Product(String name, int price,int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        String a =  getName() +" | " +  getPrice() + " | " +getStock();
        return a;

    }

}
