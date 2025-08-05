package Practice_Thread;

public class runMain {
    public static void main(String[] args) {
        Thread t = new Thread((new MyRunnable()));
        t.start();
    }
}

class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Tread is running");
    }
}
