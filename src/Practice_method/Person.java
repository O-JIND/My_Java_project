package Practice_method;

public class Person {
    String name,nation;
    int age;
    static int count;
    public Person(String name,String nation,int age){
        this.name= name;
        this.nation = nation;
        this.age = age;
        count++;
    }

    public void introduce(){
        System.out.printf("HI I'm %s from %s and %s years old nice to meet you\n" ,name,nation,age);

    }
    public static void getPersonCount(){
        System.out.println(count+ "\n");
    }

    public static void main(String[] args) {
        Person JIN = new Person("JIN","Korea",25);
        Person RIN =new Person("RIN","Japan",21);
        Person CONG = new Person("CONG","Korea",25);
        JIN.introduce();
        RIN.introduce();
        CONG.introduce();
        getPersonCount();
    }
    }



