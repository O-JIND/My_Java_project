package Practice_inheritance.EM;

public class Animal {
    protected String name;
    public Animal(String name){
        this.name=name;
    }
    public void introduce(){
        System.out.println("안녕하세요 저는 "+getClass().getSimpleName() + " " + name +"입니다");
    }
    @Override
    public String toString(){
        return getClass().getSimpleName() + " " + name;
    }
}
