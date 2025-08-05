package Practice_inheritance.Remote;

public class Appliance {
    String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println("브랜드 : "+brand);
    }
}
