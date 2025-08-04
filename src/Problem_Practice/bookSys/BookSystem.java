package Problem_Practice.bookSys;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;
public class BookSystem {
    private String tile,author;
    private int price;
    Scanner sc = new Scanner(System.in);
    TreeMap<String,Book> BMap = new TreeMap<>();
    List<Book> na =new ArrayList<>();
    public void SysMenu(){
        System.out.println("""
                ---------------------
                    1. 도서 등록
                    2. 도서 목록 
                    3. 도서 검색
                    4. 도서 삭제
                    5. 끝내기 
                ---------------------
                """);

    }
    public void add_Book(){
        System.out.println("도서 제목을 입력하세요.");
        String name =sc.nextLine();
        System.out.println("작가를 입력하세요.");
        String author =sc.nextLine();
        System.out.println("가격을 입력하세요. ");
        int price = sc.nextInt();
        sc.nextLine();
        Book book = new Book(author,price);
        BMap.put(name,book);
        System.out.println(name+"("+author+")" +" 추가하였습니다.");

    }
    public void BookList(){
        for(String s:BMap.keySet()){
            System.out.println("("+s+" , "+BMap.get(s)+")");
        }
        if(BMap.keySet()==null){
            System.out.println("등록된 도서가 없습니다.");
            sc.nextLine();
        }
    }

    public void Booksearch() {
        System.out.print("찾는 책의 제목 : ");
        String ser = sc.next();
        boolean found = false;
        for (String bb : BMap.keySet()) {
            if (ser.equals(bb)) {
                System.out.println(ser + "은 등록되어있습니다.");
                found = true;
            }
            if (!found) {
                System.out.println("등록된 도서가 아닙니다.");

            }
        }
    }
    public void Bookremove() {
        System.out.println("찾으시는 도서를 입력해주십시오.");
        String rem = sc.nextLine();
        boolean FF = false;
        for (String b : BMap.keySet()) {
            if (rem.equals(b)) {
                System.out.println(rem + ":: 도서를 지우겠습니다.");
                FF=true;
            }
        }
        if(FF) {
            BMap.remove(rem);
        }else{
            System.out.println("도서를 찾지 못했습니다.");
        }
    }
//containKey로도 가능


    public void Bookend(){
        System.out.println("정말 종료하시겠습니까? 1- Yes 2 - No");
        int end = sc.nextInt();
        if (end == 1) {

        }
    }

    public void MenuFunc(){
        while(true){
            loadBooks();
            int a = sc.nextInt();
            sc.nextLine();
                switch (a){
                    case 1: add_Book();
                        break;
                    case 2: BookList();
                        break;
                    case 3: Booksearch();
                        break;
                    case 4: Bookremove();
                        break;
                    case 5: Bookend();
                        saveBooks();
                        return;
                    default:
                        System.out.println("다시 입력하세요.");
                }
        }
    }

    public void saveBooks() {
        try (PrintWriter pw = new PrintWriter(new FileWriter("src/Problem_Practice/bookSys/books.txt"))) {
            for (Map.Entry<String, Book> entry : BMap.entrySet()) {
                String title = entry.getKey();       // 제목
                Book book = entry.getValue();        // Book 객체

                pw.println(title + "," + book.getAuthor() + "," + book.getPrice());
            }

            System.out.println("📁 도서 정보 저장 완료!");
        } catch (IOException e) {
            System.out.println("⚠ 저장 중 오류: " + e.getMessage());
        }
    }

    public void loadBooks() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Problem_Practice/bookSys/books.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                // 3개 정보가 모두 있는 경우만 처리
                if (parts.length == 3) {
                    String title = parts[0];
                    String author = parts[1];
                    int price = Integer.parseInt(parts[2]);

                    Book book = new Book(author, price);
                    BMap.put(title, book);  // 제목이 key, Book이 value
                }
            }
            System.out.println("📥 도서 정보 불러오기 완료!");
        } catch (IOException e) {
            System.out.println("⚠ 불러오기 중 오류 발생: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("⚠ 가격 변환 오류: " + e.getMessage());
        }
    }



}



