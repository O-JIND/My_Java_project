package Ch02_control_statement;

public class While02 {
    public static void main(String[] args) {
        int i=1,j=0,k=0;
        while(i<11){
            if (i%2==0){
                j+=i;
            }else{
                k+=i;
            }
            i++;
        }
        System.out.println("even : " + j);
        System.out.println("odd : " + k);


    }
}
