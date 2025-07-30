package Ch04_create_class_package;

public class SaramMain01 {
    public static void main(String[] args) {

        Sararm01 yu =new Sararm01("김유신","대한민국",182,82,"게임","A");
        yu.display();
        yu.showBmiInfo(yu.weight,yu.height);
        Sararm01  Jin=new Sararm01("Jin","Korea",170.3,75,"Game","A");
        Jin.display();
        Jin.showBmiInfo(Jin.weight, Jin.height);
        Jin.showGenderInfo(3);


    }

}


class Sararm01 {
    String nation, name, hobby, blood;
    double height, weight;

    public Sararm01(String name, String nation, double height,double weight, String hobby, String blood){
        this.name=name;
        this.nation=nation;
        this.height=height;
        this.weight=weight;
        this.hobby=hobby;
        this.blood=blood;
}
    public void display(){
        System.out.printf("국적: %s\n이름: %s\n신장: %.1f\n체중: %.1f\n취미: %s\n혈액형: %s\n", nation, name, height, weight, hobby, blood);
    }
    public String showGenderInfo(int a){
        String gen;
        if(a==1||a==3){
            gen = "Male";
        } else if (a==2||a==4) {
            gen = "Female";
        }else {
            gen="third sex";
        }
        return ("Gender is " + gen);
    }
    public void showBmiInfo(double weight, double height){
        Double bmi =weight /Math.pow((height/100),2);
        String State = " ";
        if(bmi<0){
            State = "Null";
        } else if(bmi>30){
            State="비만";
        } else if (30>bmi && bmi >24.9) {
            State="과체중";
        } else if (25> bmi && bmi >18.4) {
            State ="정상체중";
        }else{
            State = "저체중";
        }
        System.out.println("BMI에 따른 체중 : "+State);

        /*gpt ==String state = (bmi > 30) ? "비만" :
                       (bmi > 24.9) ? "과체중" :
                       (bmi > 18.4) ? "정상체중" : "저체중";*/
    }





}
