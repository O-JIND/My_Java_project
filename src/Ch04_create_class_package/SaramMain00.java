package Ch04_create_class_package;

public class SaramMain00 {
    String nation, name, hobby,blood;
    double height, weight;

    public SaramMain00 yusin(){
        nation="대한민국";
        name="김유신";
        height=172.5;
        weight=72.5;
        hobby="게임";
        blood="AB";
        return this;
    }

    public SaramMain00 soon(){
        nation="대한민국";
        name="김유신";
        height=161.5;
        weight=47.3;
        hobby="러닝";
        blood="A";
        return this;
    }

    public void print(){
        System.out.printf("국적: "+nation +"\n"+"이름: "+name +"\n"+"신장: "+height +"\n"   );
        System.out.printf( "체중: "+weight +"\n" +"취미: "+hobby +"\n"+"혈액형: "+blood+"\n");



    }


    public static void main(String[] args) {
        SaramMain00 sr = new SaramMain00();
        sr.yusin().print();
        sr.soon().print();


    }

}
