package Practice_Thread;

public class Ticket {
    private int ticket = 5;

    public synchronized void reserve(String userName){
        if(ticket >0){
            System.out.println(userName + "Trying....");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(userName+"Success "+ticket+"remains");
        }else {
            System.out.println("예매 실패");
        }




    }





}
