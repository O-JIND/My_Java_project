package Practice_Thread;

public class MaR implements Runnable {
    private String name;

    public MaR(String name) {
        this.name = name;
    }


    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + "실행중 " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}