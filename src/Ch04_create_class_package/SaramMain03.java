package Ch04_create_class_package;

public class SaramMain03 {
    public static void main(String[] args) {
        Saram03 yusin = new Saram03();
        Saram03 soon = new Saram03();
        yusin.setName("KKK");
        yusin.setHeight(183);
        yusin.setWeight(42);
        soon.setHeight(161);

        System.out.println("이름 : " +yusin.getName());
        System.out.println("키 : " +yusin.getHeight());


    }
}
