package Practice_inheritance.Role;

public class Mage extends Character implements Attackable{

    public Mage(double HP, double MP, double ATK,double level) {
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
    public void attack() {
        System.out.println( "Mage가 마법을 시전합니다!");
    }
}
