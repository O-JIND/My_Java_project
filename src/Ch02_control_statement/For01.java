package Ch02_control_statement;

public class For01 {
    public static void main(String[] args) {
        int i=0, j=0, k=0;
        for(i = 1;i<6;i++ ){
            j=i+1;
            k+=i*j;
            System.out.println(k);
        }
        j=0;
        for(i = 1;i<97;i+=5 ){
            j+=(int)Math.pow(i,2);
            System.out.println(j);
            System.out.println(i);
        }
        System.out.println("총합은 : " + j);
        System.out.println("총합은 : " + k);

    }
}

