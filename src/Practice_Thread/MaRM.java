package Practice_Thread;

public class MaRM {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MaR("Background"));
        Thread t2 = new Thread(new MaR("file"));


        t1.start();
        t2.start();
    }
}
