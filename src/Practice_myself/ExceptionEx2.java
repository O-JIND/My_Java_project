package Practice_myself;
import static java.lang.System.out;

public class ExceptionEx2 {
    public static void main(String[] args) {

        int[] var = {100, 200, 300};
        for(int i=0; i<=3;i++){
            try {
                out.println(var[i]);
            }catch (ArrayIndexOutOfBoundsException ae){
                out.println("배열이 넘어감");
            }
        }out.println("THE END");
    }


}
