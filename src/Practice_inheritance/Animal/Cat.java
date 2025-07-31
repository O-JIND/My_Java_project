package Practice_inheritance.Animal;

public class Cat implements Animal {
    @Override
    public void sound(){
        System.out.println("Meows Meows");
    }
    @Override
    public void move(){
        System.out.println("Gol Gol");
    }
}
