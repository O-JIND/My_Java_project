package Ch01_variable_operator;

public class Casting {
    public static void main(String[] args) {

        double d = 100;
        System.out.println("d  :" +d);
        int i = (int)12.5;
        System.out.println(i);

        System.out.println((double)(15/55));


        int kor = 50, eng = 60, math = 80;

        int total = 0 ;
        double average = 0.0;
        total=kor+eng+math;
        average=(double)total/3;
        System.out.println("총점 : " +  total);
        System.out.println("평균 : "+ average);



        char ch1 = 'l';
        char ch2 = 'd';

        boolean boo1 = (ch1 > ch2);//암시적 형변환

        System.out.println(boo1);

        int result;
        result = ch1-ch2 +5;
        System.out.println("result : "+result);
        char ch3 = 'D';
        String str = ch3>='A' && ch3 <= 'Z'? "Yes":"NO";
        System.out.println(str);
    }//asci code A 65 a 97 0 48
}
