package Problem_Practice.SM;

public class SMMain {
    public static void main(String[] args) {
        SmartDevice[] devices = {
                new SmartTV("a"),
                new SmartTV("b"),
                new SmartSpeaker("c"),
                new SmartSpeaker("d"),
                new SmartTV("e"),
                new SmartSpeaker("f")
        };

        for( int i = 0 ; i < devices.length;i++){
            if(devices[i] instanceof SmartTV ){
                ((SmartTV)devices[i]).control();
            }else {
                ((SmartSpeaker)devices[i]).turnOn();
            }




        }






    }

}
