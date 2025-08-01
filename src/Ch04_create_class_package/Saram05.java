package Ch04_create_class_package;

public class Saram05 {
    private String name;
    private double height, weight;
    private  String blood ,hobby= "없음";
    public Saram05(String name, double height, double weight,  String blood ,String hobby) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.blood = blood;
        this.hobby = hobby;

    }public Saram05(String name, double height, double weight,  String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.blood = blood;


    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.height);
        System.out.println(this.weight);
        System.out.println(this.hobby);
        System.out.println(this.blood);
    }


}
