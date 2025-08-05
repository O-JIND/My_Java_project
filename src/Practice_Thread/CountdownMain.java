package Practice_Thread;

public class CountdownMain {
    public static void main(String[] args) throws InterruptedException{
        Countdown c1 = new Countdown("THread 1");
        Countdown c2 = new Countdown("THread 2");

    c1.start();
    c1.join();
    c2.start();



    }
}
