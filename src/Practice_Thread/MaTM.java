package Practice_Thread;

public class MaTM {
    public static void main(String[] args) {
        MaT t1 = new MaT("거북");
        MaT t2 = new MaT("토끼");
        t1.start();
        t2.start();
    }
}
