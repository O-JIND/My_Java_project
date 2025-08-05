package Practice_inheritance.play;

public abstract class Media implements Playable {
    private String title ;
    public Media(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void showinfo();

}
