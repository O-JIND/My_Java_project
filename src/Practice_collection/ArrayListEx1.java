package Practice_collection;
import java.util.*;
public class ArrayListEx1 {

    String a;

    public ArrayListEx1(String a) {
        this.a = a;
    }

    @Override
    public String toString(){
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ArrayListEx1> Aray = new ArrayList<>();

        while (true) {
            String b = sc.next();

            if(b.equals("exit")){
                break;
            }
            Aray.add(new ArrayListEx1(b));

        }
        for(ArrayListEx1 s : Aray){
            System.out.println(s);
        }
    }
}
