package Practice_Thread;

public class joiiManin {
    public static void main(String[] args) throws InterruptedException{
        Joii j1 = new Joii("11");
        Joii j2 = new Joii("22");

        j1.start();
        j1.join();
        j2.start();



    }


}
