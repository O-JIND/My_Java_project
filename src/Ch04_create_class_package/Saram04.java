package Ch04_create_class_package;
import java.util.Scanner;
public class Saram04 {
        String name, hobby/*="bolling"*/, blood;
        double height, weight;
        Scanner scan = null;
        public Saram04(String name, String hobby, String blood,double height,double weight){
                scan=new Scanner(System.in);
                this.name=name;
                this.hobby=hobby;
                this.blood=blood;
                this.height=height;
                this.weight=weight;
        }

        public Saram04(String name, double height, double weight, String blood) {
                this.name=name;
                this.hobby="bolling";
                this.blood=blood;
                this.height=height;
                this.weight=weight;
        }

        public void display(){

                System.out.println("이름 : "+name);
                System.out.println("취미 : "+hobby);
                System.out.println("혈액형 : "+blood);
                System.out.println("키 : "+height);
                System.out.println("몸무게 : "+weight);
               /* if (scan==null) {
                        System.out.println("정수 입력 : ");
                        int sc = this.scan.nextInt();
                        System.out.println("정수 : " + sc);
                }*/

        }

}
