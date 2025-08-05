package Practice_inheritance.play;

public class MM {
    public static void main(String[] args) {
        Media a = new Music("IU ");
        Media b = new Video("G-dragon");

        a.play();
        a.showinfo();
        b.play();
        b.showinfo();



    }
}
