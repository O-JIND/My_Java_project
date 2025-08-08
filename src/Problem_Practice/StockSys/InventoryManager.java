package Problem_Practice.StockSys;

import com.sun.source.tree.Tree;

import java.io.*;
import java.util.*;

public class InventoryManager implements Action {
    Product product;
    Scanner sc = new Scanner(System.in);
    Set<Product> infoList =new HashSet<>();
    InventoryManager(Product product){
        this.product=product;
    }
    public void BasePrint(){
        System.out.println("""
        
                1. 상품 추가
                2. 상품 삭제
                3. 재고 수정
                4. 전체 목록 보기
                5. 종료
                
                """);
    }
    @Override
    public void addProduct() {
        System.out.println("추가할 상품 명을 입력하세요");
        String nma = sc.next();
        System.out.println("상품 가격을 입력하세요");
        int pr = sc.nextInt();
        System.out.println("상품 재고를 입력하세요");
        int st = sc.nextInt();
        sc.nextLine();
        Product nw = new Product(nma,pr,st);
        infoList.add(nw);
    }
    @Override
    public void removeProduct() {
        System.out.println("삭제할 상품 명을 입력하세요");
        String search = sc.nextLine();
        if(!infoList.remove(search)){
            infoList.remove(search);
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
    @Override
    public void updateStock() {
        System.out.println("변경 할 상품 명을 입력해주세요.");
        String sear = sc.next();

        for(Product p : infoList)
        {
            if (p.getName().equals(sear)) {
                int change = sc.nextInt();
                p.setStock(change);
                break;
            }
        }
    }
    @Override
    public void showAllProducts() {
        for(Product one : infoList){
            System.out.println(one);

        }
    }


    public void SaveFiles() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Stock.txt"))) {
            for (Product p : infoList) {
                bw.write(p.getName() + "," + p.getPrice() + "," + p.getStock());
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }


    public void LoadFiles() {
        try (BufferedReader br = new BufferedReader(new FileReader("Stock.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            int price = Integer.parseInt(parts[1]);
            int stock = Integer.parseInt(parts[2]);
            infoList.add(new Product(name, price, stock));
        }
    } catch (IOException e) {
            e.printStackTrace();
        }
    }




}

