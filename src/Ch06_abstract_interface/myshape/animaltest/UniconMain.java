package Ch06_abstract_interface.myshape.animaltest;

public class UniconMain {
    public static void main(String[] args) {
        Unicon uni1 = new Unicon("Ma","M","당근");
        uni1.display();
        uni1.flutter();


        System.out.println();

        Unicon uni2 = new Unicon("Fe","F","건초");
        uni2.display();


        Animal ani = new Unicon("다형성", "M","사과");
        ani.eat();

        //템플릿 메소드
    }
}
