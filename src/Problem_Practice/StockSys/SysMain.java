package Problem_Practice.StockSys;
import  java.util.*;
public class SysMain {
    public static void main(String[] args) {


        Product product = new Product(null,0,0);
        InventoryManager Inven = new InventoryManager(product);
        Scanner sc = new Scanner(System.in);
        Inven.infoList.clear();
        Inven.LoadFiles();
        while (true){
           try {
                Inven.BasePrint();
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        Inven.addProduct();
                        continue;
                    case 2:
                        Inven.removeProduct();
                        continue;
                    case 3:
                        Inven.updateStock();
                        continue;
                    case 4:
                        Inven.showAllProducts();
                        continue;
                    case 5:
                        System.out.println("정말 종료하시겠습니까? 1  - Yes 2  - No");
                        int close = sc.nextInt();
                        if (close == 1) {
                            Inven.SaveFiles();
                            System.out.println("저장하였습니다.");
                            break;
                        }
                        continue;

                    default:
                        System.out.println("다시 입력하세요.");
                        continue;
                }break;
            } catch (Exception e) {
               System.out.println("다시 입력하시오.");
               sc.nextLine();
           }
        }






    }
}
