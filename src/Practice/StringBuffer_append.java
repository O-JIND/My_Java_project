package Practice;

public class StringBuffer_append {

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Sun");
        StringBuffer sb2 = sb1.append(" & Moon");

        sb2.insert(10, " & tesla");
        String sb3 = sb1.toString();
        System.out.println("sb1 : " + sb3);


    }}

