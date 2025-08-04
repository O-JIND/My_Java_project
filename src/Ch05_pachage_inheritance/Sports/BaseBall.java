package Ch05_pachage_inheritance.Sports;

public class BaseBall extends Sportss {
    private int innings;
    private double hitrate;

    public  BaseBall(String name, int entry,int innings,double hitrate){
        super(name,entry);
        this.innings=innings;
        this.hitrate=hitrate;
    }

    public void disply(){
        super.Sinfo();
        System.out.printf("%d inning included and hitrate is %,.2f\n",innings, hitrate);
    }
}
