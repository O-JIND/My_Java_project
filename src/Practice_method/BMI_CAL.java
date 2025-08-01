package Practice_method;

public class BMI_CAL {

    String name;
    double height, weight;
    public BMI_CAL(String name,double height,double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double getBmi(){
        double BMI = weight/Math.pow(height/100,2);
        return BMI;
    }

    String getBmiState(){
        String State=(getBmi() > 30)? "비만":
                     (getBmi() > 25) ? "과체중":
                     (getBmi()>18.5) ? "정상":"저체중";
        System.out.println(State);
        return State;
    }





    public static void main(String[] args) {
        BMI_CAL spec = new BMI_CAL("JIN",161.2,50.4);
        spec.getBmiState();
        double BB=spec.getBmi();
        System.out.println(BB);
    }
}
