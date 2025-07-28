package Ch02_control_statement;

public class For02_sw {
    public static void main(String[] args) {
        int i, j=0, k=0;
        for (i = 1; i < 11; i++){
            switch(i%2){
                case 0:
                    j+=i;
                    break;
                default:
                    k+=i;
            }
        }
        System.out.println("짝수의 합 : "+ j);
        System.out.println("홀수의 합 "+k);
    }

}


