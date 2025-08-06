package Practice_Thread.PC;

public class Producer extends Thread {
    private Box box;

    public Producer(Box box) {
        this.box = box;
    }
    public void run(){
        for (int i =1 ; i<=5 ; i++){
            box.produce(i);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }





}
