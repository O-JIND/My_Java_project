package Ch05_pachage_inheritance.animalpkg01;

public class AnimalMain {
    public static void main(String[] args) {
        Animal01[] ani = {
                new Lion01("사자", "초원", 10, 80),
                new Eagle01("독수리", "산", 60, 70),
                new GoldFish01("금붕어", "물", 15, 2)
        };



        for(int i = 0 ; i < ani.length;i++){
            if(ani[i] instanceof Lion01){
                ((Lion01)ani[i]).print();
                ((Lion01)ani[i]).run();
            }
            else if(ani[i] instanceof Eagle01){
                ((Eagle01)ani[i]).print();
                ((Eagle01)ani[i]).fly();
            }

            else{
                ((GoldFish01)ani[i]).print();
                ((GoldFish01)ani[i]).swim();
            }
        }
    }
}