package Practice_inheritance.Animal;

import java.util.*;

public class AnimalTest{
    public static void main(String[] args) {
        List<Animal> ani =new ArrayList<>();
        ani.add(new Dog());
        ani.add(new Bird());
        ani.add(new Cat());

        for (Animal a : ani){
            a.sound();
            a.move();
            System.out.println( " ------- ");
        }
    }
}
