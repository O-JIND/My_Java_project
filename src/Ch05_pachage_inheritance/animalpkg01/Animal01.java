package Ch05_pachage_inheritance.animalpkg01;

public class Animal01 {
    private String name, habitat;
    private double lifespan,speed;
    Animal01(String name, String habitat,double lifespan, double speed){
        this.name=name;
        this.habitat=habitat;
        this.lifespan=lifespan;
        this.speed=speed;
    }

    public void spec(){
        System.out.println("이름 : "+name);
        System.out.println("서식지 :"+habitat);
        System.out.println("수명 : "+lifespan);
        System.out.println("속도 : "+speed);

    }


    public String getName() {
        return name;
    }

    public double getLifespan() {
        return lifespan;
    }

    public double getSpeed() {
        return speed;
    }

    public String getHabitat() {
        return habitat;
    }
}
