package Practice_inheritance.EM;

public class EMMain {
    public static void main(String[] args) {
        Animal[] AA={
            new Dog("CHOCO"),
            new Turtle("MONT")
        };


        for(Animal s:AA){
            s.introduce();
            System.out.println((s.toString()));
            if (s instanceof Soundable) {
                ((Soundable) s).makeSound();
            }
        }


    }
}
