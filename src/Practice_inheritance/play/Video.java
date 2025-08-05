package Practice_inheritance.play;

public class Video extends Media implements Playable {

    public Video(String title) {
        super(title);
    }



    @Override
    public void play(){
        System.out.println("Video가 시작됩니다.");
    }

    @Override
    public void showinfo(){
        System.out.println(super.getTitle());
    }


}
