package Practice_Thread.PC;

public class Consumer extends Thread {
    private Box box;

    public Consumer(Box box) {
        this.box = box;
    }
    public void run(){
        for (int i =1 ; i<=5 ; i++){
            box.consume();
            try{
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
