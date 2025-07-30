package Practice_method;
import  java.util.*;
public class Student01 {
    String name;
    int Score;

    public Student01(String name,int Score){
        this.name = name;
        this.Score = Score;
    }


    public String def(int a){
        String b;
        if(a>90){
            b = "A";
        } else if (a>80) {
            b = "B";
        } else if (a>70) {
            b = "C";
        } else if (a>60) {
            b = "D";
        }else {
            b = "F";
        }
        return b;
    }
    public static void main(String[] args) {
        List<Student01> sds =stData.setdata();
        for (Student01 s : sds){
            Student01 ss = new Student01(s.name,s.Score);
            String c =ss.def(s.Score);
            System.out.println( s.name + "의 학점은 "+c+"입니다.");

        }

    }
}
class stData{

    public static List<Student01> setdata(){
        List<Student01> Sd = new ArrayList<>();
        Sd.add(new Student01("JIN",((int)(Math.random()*70+30))));
        Sd.add(new Student01("RIN",((int)(Math.random()*70+30))));
        Sd.add(new Student01("CONG",((int)(Math.random()*70+30))));
        Sd.add(new Student01("BUT",((int)(Math.random()*70+30))));
        Sd.add(new Student01("BTK",((int)(Math.random()*70+30))));
        Sd.add(new Student01("KOK",((int)(Math.random()*70+30))));
        Sd.add(new Student01("RTX",((int)(Math.random()*70+30))));
        Sd.add(new Student01("MIN",((int)(Math.random()*70+30))));

        return Sd;
    }
}