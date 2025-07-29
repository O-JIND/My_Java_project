package Ch02_control_statement;

public class While01 {
    public static void main(String[] args) {
        int i=1,t=0,j=i+1;
        while (i<97){
            t+=i*j;
            i++;
        }
        System.out.println(t);
    }
}
