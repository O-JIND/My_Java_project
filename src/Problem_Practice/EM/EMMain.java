package Problem_Practice.EM;

public class EMMain {
    public static void main(String[] args) {
        Employee[] em = {
        new Manager("Jik"),
                new Developer("Kol"),
        new Manager("Sal"),
        new Developer("Soon"),
        new Developer("KONG"),
        new Developer("SSa")
        };


        for(int i= 0 ; i<em.length ; i++){
            if(em[i] instanceof Manager){
                ((Manager)em[i]).manage();
                ((Manager)em[i]).work();

            }else {
                ((Developer)em[i]).code();
                ((Developer)em[i]).work();
            }


        }


    }
}
