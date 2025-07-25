package Practice_myself;

public class Bank {
    private String point;
    static float interest;

    public Bank(String point){
        this.point = point ;
    }

    public void getInfo(){
        System.out.println("지점: "+point);
        System.out.println("이자율: "+interest);
    }
}
