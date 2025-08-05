package Practice_inheritance.Role;

public class Warrior extends Character implements Attackable{
    public Warrior(double HP, double MP, double ATK,double level) {
        super(HP, MP, ATK,level);
    }

    @Override
    public double getATK() {
        return super.getATK();
    }

    @Override
    public double getHP() {
        return super.getHP();
    }

    @Override
    public void attack(){
        System.out.println("Warrior가 공격을 합니다!");
    }



}
