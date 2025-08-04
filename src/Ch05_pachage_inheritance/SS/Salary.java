package Ch05_pachage_inheritance.SS;

public class Salary extends Employee{
    double sal,Msal;
    double  yearsal;
    public Salary(String name, double sal, String type ){
        super(name,type);
        this.sal = sal;
        if(type.equals("영업")||type.equals("판매")){
            Msal=sal*15;
        }else {
            Msal=sal*12;
        }
        yearsal = Msal *12;
    }
    public Salary(String name, String type ){
        super(name,type);
        sal = 3000;
        if(type.equals("영업")||type.equals("판매")){
            Msal=sal*15;
        }else {
            Msal=sal*12;
        }
        yearsal = Msal *12;
    }


    public void display(){
        System.out.printf("%s(%s)  급여 : %.1f , 연봉 : %.1f  ",name,type,Msal,yearsal);
    }
}
