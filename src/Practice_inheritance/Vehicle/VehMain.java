package Practice_inheritance.Vehicle;

public class VehMain {
    public static void main(String[] args) {
        Vehicle[] Vee = {
          new Car("GENESIS"),
          new ElectricScooter("HONDA")
        };
        for(Vehicle s : Vee){
            s.move();
            if(s instanceof Chargeable){
                ((Chargeable)s).charge();
            }
        }
    }


}
