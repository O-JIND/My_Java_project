package Ch06_abstract_interface.myshape.animaltest;

public class Unicon extends Animal implements UniconBir,UniconHor{
    private String name ,Gen,feed;
    private int velocity;
    public Unicon(String name, String Gen, String feed) {
        this.name=name;
        this.Gen=Gen;
        this.feed=feed;

        if(this.Gen == "M"){
            this.velocity=UniconBir.speed;
        }else{
            this.velocity = UniconHor.speed;
        }
    }

    @Override
    public void fly() {
        String msg =this.name +" 시속 "+UniconBir.speed+"의 속도로 날아 갑니다.";
        System.out.println( msg);
    }

    @Override
    public void run() {
        String msg = this.name +" 시속 "+UniconHor.speed+"의 속도로 달려 갑니다.";
        System.out.println( msg);
    }

    @Override
    public void eat() {
        String msg =this.name +" 가 "+this.feed+"를 먹고 있습니다..";
        System.out.println( msg);
    }


    public void display(){
        String msg = this. name + "의 초기 속도는 " + this.velocity + " 입니다.";
        System.out.println( msg);
    }




}
