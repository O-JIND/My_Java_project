package Ch01_variable_operator;

public class Add {
    public static void main(String[] args) {
        int x ;
        int y ;
        int z;
        int d;
        x=3;
        y=10;
        z=y/x;
        d = y%x;
        System.out.printf("%d+%d는 %d이다.\n",x,y,z);

        String message,message1;
        message = x+"나누기"+y+"은"+z+"이다.";
        message1 = "나머지는"+d+"이다.";
        System.out.println(message);
        System.out.println(message1);
    }
}
