package Ch05_pachage_inheritance.Sports;

public class FootBall extends Sportss {
    private int halves;
    private int Goals;

    public  FootBall(String name, int entry,int halves,int Goals){
        super(name,entry);
        this.halves=halves;
        this.Goals=Goals;
    }


    public void disply(){
        super.Sinfo();
        System.out.printf("%d half time is included, %d Goals\n",halves,Goals);
    }
    }
