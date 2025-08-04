package Ch05_pachage_inheritance.Sports;

public class SportMain {
    public static void main(String[] args) {
        FootBall fb = new FootBall("Soccer",11,1,5);
        BaseBall bs = new BaseBall("Baseball",9,9,0.412);
        System.out.println(" =============================");
        fb.disply();
        System.out.println(" =============================");
        bs.disply();
        System.out.println(" =============================");
    }
}
