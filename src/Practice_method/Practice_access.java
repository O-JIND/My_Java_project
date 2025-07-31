package Practice_method;

public class Practice_access {
    public String name ;
    private int age;
    int id;

    Practice_access(String name,int age,int id){
        this.name = name;
        this.age=age;
        this.id=id;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }



    public static void main(String[] args) {
        Practice_access Pr = new Practice_access("KK",24,14108498);
        System.out.println(Pr.name);

        Pr.setAge(28);
        Pr.getAge();
        System.out.println(Pr);

    }


}
