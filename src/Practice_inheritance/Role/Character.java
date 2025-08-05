package Practice_inheritance.Role;

public class Character {
    private double HP,MP, ATK,level;
    public double getATK() {
        return ATK;
    }
    public double getHP() {
        return HP;
    }
    public Character(double HP, double MP, double ATK,double level) {
        this.HP = HP;
        this.MP = MP;
        this.ATK = ATK;
        this.level = level;
    }
    public void Status(){
        System.out.println("HP : "+HP);
        System.out.println("MP : "+MP);
        System.out.println("ATK : "+ATK);
        System.out.println("level : "+level);
    }





}
