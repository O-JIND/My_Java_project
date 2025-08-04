package Problem_Practice.bookSys;

public class Book extends BookSystem{
    private String author;
    private int price;

    public Book(String author, int price) {
        this.author = author;
        this.price = price;
    }
    public String getAuthor() {return author;}
    public int getPrice() {return price;}


    public String toString()
    {
    return author + ", " + price + "원";
    }
}


