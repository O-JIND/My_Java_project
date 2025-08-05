package Practice_Thread;

public class Countdown extends Thread{
    private String name;
    public Countdown(String name){
        this.name = name;
    }


    public void run(){
        for (int i = 3 ; i >=1;i--){
            System.out.println("Count :" + i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }




        }
    }




}
