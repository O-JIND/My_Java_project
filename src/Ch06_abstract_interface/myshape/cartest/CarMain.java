package Ch06_abstract_interface.myshape.cartest;

public class CarMain {
    public static void main(String[] args) {

        Car[] socar ={ new Grandeur("Grandeur",5000,"연비 : ",Key.SMART,11),
         new Sonata("Sonata",4000,Key.SMART,"Hyundai"),
         new Avante("Avante",3000,Key.KEY,"차라리 레이?")
        };
        for (Car s : socar){
            if(s instanceof Avante){
                ((Avante) s).print();
            } else if (s instanceof Sonata) {
                ((Sonata) s).print();
            }else {
                ((Grandeur)s).print();
            }
            System.out.println(s);

            System.out.println("================================================");
        }



        for (Car s : socar){
            System.out.println(s.getName());
            s.turnOn();
            for ( int i = 0 ; i < 6 ; i++){
                int v = Math.abs((int)(Math.random()*20))+10;

                s.checkSpeed(v);

            }
            s.turnOff();
            System.out.println("=====================");

        }

        }





    }

