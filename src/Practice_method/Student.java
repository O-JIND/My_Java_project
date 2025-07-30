package Practice_method;

public class Student{
    String name;
    int score;

    public Student(String name, int score){
        this.name = name;
        this.score= score;
    }

    public void printInfo(){
        System.out.println(name +" : "+score);
    }


    public static void main(String[] args) {
        Student st = new Student("ado",200);
        st.printInfo();
    }
}
