package Practice_Thread;

public class User implements Runnable{
    private  Ticket sys;
    private String name;
    public User(Ticket sys, String name){
        this.sys = sys;
        this.name = name;
    }

    public void run(){
        sys.reserve(name);
    }




}
