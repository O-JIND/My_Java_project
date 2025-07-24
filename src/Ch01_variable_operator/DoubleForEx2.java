package Ch01_variable_operator;

public class DoubleForEx2 {
    public static void main(String[] args) {

       String abc= "AbCdEfGhIjKlMnOpQrStUvWxYz";

       for (int i=abc.length();i>0;i--){
           String ab=abc.substring(0,i -1);
           System.out.println(ab);

       }


    }
}
