package Practice_method;

public class People {
    String name;
    int age;
    People(String name,int age) {
        this.name=name;
        this.age=age;
    }
    void printInfo(){
        System.out.printf("이름 : %s , 나이 : %d",name,age);
    }

    public static void main(String[] args) {
        People p = new People("KIM",25);
        p.printInfo();


    }

}
