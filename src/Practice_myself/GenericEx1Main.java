package Practice_myself;

public class GenericEx1Main {
    public static void main(String[] args) {
        GenericEx1<String> t = new GenericEx1<String>();

        String[] ss = {"new","ike","dau"};
        t.set(ss);
        t.print();
    }
}

