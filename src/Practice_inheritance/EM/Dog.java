package Practice_inheritance.EM;

public class Dog extends Animal implements Soundable{
    private String Dog;
        public Dog(String name){
            super(name);
            this.Dog = Dog;
        }
        @Override
        public void makeSound()  {
            System.out.println("bark bark");
        }

}
