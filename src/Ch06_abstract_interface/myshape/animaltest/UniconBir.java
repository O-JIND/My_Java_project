package Ch06_abstract_interface.myshape.animaltest;

public interface UniconBir {
    int speed =  300;


    default void flutter(){
        System.out.println("날개를 활짝펴고 세상을 자유롭게날거야");
    }

    public void fly();
}
