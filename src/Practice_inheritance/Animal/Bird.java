package Practice_inheritance.Animal;

public class Bird implements Animal {
    @Override
    public void sound(){
        System.out.println("Chirps Chirps");
    }
    @Override
    public void move(){
        System.out.println("flies");
    }
}
