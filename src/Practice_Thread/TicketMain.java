package Practice_Thread;

public class TicketMain {
    public static void main(String[] args) {
        Ticket syst = new Ticket();
        for(int i = 1; i <=8;i++){

            Thread t = new Thread(new User(syst, "사용자 "+i));
            t.start();

        }



    }


}
