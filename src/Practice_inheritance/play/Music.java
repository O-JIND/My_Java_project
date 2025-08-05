package Practice_inheritance.play;

public class Music extends Media implements Playable {
    public Music(String name){
        super(name);
    }
    @Override
    public void play(){
        System.out.println("Music이 시작됩니다.");
    }

    @Override
    public  void showinfo(){
        System.out.println(super.getTitle());
    }

}
