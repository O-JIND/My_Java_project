package Practice_Thread;

public class Joii extends  Thread{
    private String taskName;
    public Joii(String taskName){
        this.taskName=taskName;
    }

    public void run(){
        for( int i = 1 ; i<=3 ; i++){
            System.out.println(taskName + ":"+i);
            try{
                Thread.sleep(300);
            }catch (InterruptedException  e){
                e.printStackTrace();
            }
        }



    }








}
