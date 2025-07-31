package Practice_inheritance.Animal;

public class Dog implements Animal {
    @Override
    public void sound(){
        System.out.println("bark bark");
    }
    @Override
    public void move(){
        System.out.println("syu syu");
    }
}
