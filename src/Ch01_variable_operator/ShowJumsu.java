package Ch01_variable_operator;

public class ShowJumsu {
    public static void main(String[] args) {

        String name;
        int Kor, Eng, Jap, Chi, mean;

        name = "홍길동";
        Kor = (int)(Math.random()*100);
        Eng = (int)(Math.random()*100);
        Jap = (int)(Math.random()*100);
        Chi = (int)(Math.random()*100);

        mean = (Kor + Eng + Jap + Chi)/4;

        System.out.println("이름 : "+ name);
        System.out.println("국어 : "+ Kor);
        System.out.println("영어 : "+ Eng);
        System.out.println("일어 : "+ Jap);
        System.out.println("중어 : "+ Chi);
        System.out.println("평균 : "+ mean);
    }
}
