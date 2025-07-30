package Practice_method;
import  java.util.*;
public class Book {
    String title,author;
    double price;
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    @Override
    public String toString() {
        return String.format("제목: %s 저자 : %s 가격 : %,.2f원", title, author,price);
    }
}

class BD{
    public static List<Book> setBook(){
        List<Book> bk = new ArrayList<>();
        bk.add(new Book("혼모노","성해나",16200));
        bk.add(new Book("가공범","히가시노 게이고",19800));
        bk.add(new Book("다크 심리학","다크사이드 프로젝트",19710));
        bk.add(new Book("고체 물리학","우종천",45000));
        return bk;
    }

}
class Main {
    public static void main(String[] args) {
        List<Book> bok = BD.setBook();
        for (Book s : bok){
            if (20000>s.price){
                System.out.println(s);
            }
        }
    }
}