package Practice_myself;
/*1.Book 클래스 만들기

2.필드: title, author, price

3.생성자 3개 만들기

        (1) 기본 생성자

        (2) title, author만 받는 생성자

        (3) title, author, price 모두 받는 생성자

4.생성자 내부에서 this(...)를 사용해서 중복 제거

5.객체 생성 후 정보 출력하는 print() 메서드 만들기*/
public class Book {
    String title, author;
    double price;

    public  Book() {
        this("제목 없음","작가 미상",0);

    }

    public Book(String title,String author) {

        this(title,author,10000);

    }

    public  Book(String title, String author, double price) {

        this.title=title;
        this.author=author;
        this.price=price;

    }
    public void print() {
        System.out.println(title + " / " + author + " / " + price + "원");
    }

    public static void main(String[] args) {
        Book  b1 = new Book();
        Book  b2 = new Book("개미","베르베르",10000);
        Book  b3 = new Book("전독시","미상",80000);

        b1.print();
        b2.print();
        b3.print();


    }
}

