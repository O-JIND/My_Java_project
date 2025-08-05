package Practice_inheritance.Role;

public class MAN {
    public static void main(String[] args) {
        Character W = new Warrior(100,20,30,10);
        Character M = new Mage(40,80,20,6);
        W.Status();
        ((Warrior)W).attack();
        M.Status();
        ((Mage)M).attack();


    }
}
