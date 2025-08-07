package Ch06_abstract_interface.myshape.cartest;

public abstract class Car implements Display,Radio,Speed {
    private String name;
    private int price;
    int Total_speed=0;
    int v;
    private Key key ; // 열쇠의 종류


    public String getName() {
        return name;
    }

    public Car(String name, int price,Key key) {
        this.name = name;
        this.price = price;
        this.key = key;
    }

    public void checkSpeed(int v ){

        System.out.println("현재 속도 : "+Total_speed);
        if(Total_speed>=ALLOWED_MAX_SPEED){
                speedDown(v);
            }else {
           speedUp(v);
        }
    }
    @Override
    public int speedUp(int v) {
        Total_speed+=v;
        if (Total_speed >= ALLOWED_MAX_SPEED) {
            Total_speed=ALLOWED_MAX_SPEED;}
        return Total_speed;

    }
    @Override
    public int speedDown(int v) {
        Total_speed-=v;
        if(Total_speed<0){
            Total_speed=0;
        }
        return Total_speed;
    }

    public final void turnOn(){
        String message = this.key.getName() + "로 " + this.name + "의 시동을 켭니다." ;
        System.out.println(message);
    }

    public final void turnOff(){
        String message = this.name + "의 시동을 끕니다." ;
        System.out.println(message);
    }


    @Override
    public void dis() {
        System.out.println("이름 : " + name);
        System.out.println("가격 : " + price);
    }
    @Override
    public void Anounce() {
        Radio.super.Anounce();
    }


    @Override
    public String toString() {
        String message = "이름 : " + this.name + "\n";
        message += "단가 : " + this.price + "원\n";
        message += "열쇠 타입 : " + this.key + "\n";
        message += "한글 이름 : " + this.key.getName() + "\n";
        return message;
    }
}
