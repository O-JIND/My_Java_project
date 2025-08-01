package Ch04_create_class_package;

public class Saram05Main {
    public static void main(String[] args) {
        int[] sd = {
            1,2,3,4,5,6
        };
        Saram05[] sra = new Saram05[2];//배열 정의
        sra[0] = new Saram05("이순신",187.2,81,"해상스키","B");//0번쨰 객체 생성
        sra[1]=new Saram05("김유신",180.2,70.0,"O");
        System.out.println(sra.length);

        for (int i =0;i<sra.length;i++){;
            sra[i].display();
        }



    Saram05[] AR = {
            new Saram05("장원영",170.5,41.3,"A","독서"),
            new Saram05("안유진",170.2,44.7,"O")
    };

    for(int j =0;j<(AR.length);j++){;
    AR[j].display();
    }
    }
}
