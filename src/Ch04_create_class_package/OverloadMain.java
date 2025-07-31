package Ch04_create_class_package;

public class OverloadMain {
    public static void main(String[] args) {
    int x =35 , y= 42,z =128;
    double a= 13.15, b= 141.88;

    OverAdd ad = new OverAdd();

    ad.Add(x,y);
    ad.Add(a,y);
    ad.Add(x,b);
    ad.Add(x,y);


    }
}
