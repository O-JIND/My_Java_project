package Practice_Thread.PC;

public class Box {
    private  int item ;
    private  boolean isFull = false;

    public synchronized void produce(int value){
        while(isFull){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.item = value;
        isFull=true;
        System.out.println("생산 : "+item);
        notify();
    }
public synchronized  int consume(){
        while(!isFull){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isFull=false;
    System.out.println("소비 : "+item);
    notify();
    return item;

}

}
