package Problem_Practice;
import com.sun.source.tree.Tree;

import java.util.*;
public class BookSystem {
    private String tile,author;
    private int price;

    public void SysMenu(){
        List<String> menu = new ArrayList<>();
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
    public void MenuFunc(){
        Scanner sc = new Scanner(System.in);

        TreeMap<String,String> Book = new TreeMap<>();
        List<String> na = new ArrayList<>(Book.keySet());

        while(true){
            int a = sc.nextInt();
            sc.nextLine();
                switch (a){
                    case 1:
                        System.out.println("도서 제목을 입력하세요.");
                        String name =sc.nextLine();
                        System.out.println("작가를 입력하세요.");
                        String author =sc.nextLine();

                        Book.put(name,author);
                        System.out.println(name+"("+author+")" +" 추가하였습니다.");
                        break ;

                    case 2:
                        for(String s:Book.keySet()){
                            System.out.println("("+s+" , "+Book.get(s)+")");
                        }
                        if(Book.keySet()==null){
                            System.out.println("등록된 도서가 없습니다.");
                        sc.nextLine();
                        }break;

                    case 3:
                        String ser = sc.next();
                        for(int i=0; i<na.size();i++){
                            if (ser.equals(na.get(i))) {
                                System.out.println(ser+ "는 있습니다.");
                            }else if (ser.equals(Book.get(na.get(i)))){
                                    System.out.println("의 도서는 " +na.get(i) +"가 있습니다.");
                            }else {
                                System.out.println("찾으시는 도서가 없습니다.");
                            }
                        }break;

                    case 4:
                        String rem = sc.nextLine();
                        for(int i=0; i<Book.size();i++) {
                            if (rem.equals(Book.get(i))){
                                Book.remove(rem);
                            }else{
                                System.out.println("찾으시는 도서가 존재하지 않습니다.");
                            }
                        }break;
                    case 5:
                        System.out.println("정말 종료하시겠습니까? 1- Yes 2 - No");
                        int end = sc.nextInt();
                        if(end==1){return;}
                    default:
                        System.out.println("다시 입력하세요.");
                }
        }
    }
}

