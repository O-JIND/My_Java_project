package Practice_Thread;

import Practice_inheritance.Paypay.Payment;

public class MaT extends  Thread{
    private  String name;
    public MaT(String name){
        this.name = name;
    }
    public void run(){
      for (int i = 1; i<= 5 ; i++) {
          System.out.println(name + "쓰레드: " + i);
          try {
              Thread.sleep(500);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }
}
