package Practice_collection;

public class Mybox<T> {
    private  T item;
    public T getItem(){
        return  item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Mybox<String> strbox = new Mybox<>();
        strbox.setItem("sdd");
        System.out.println(strbox.getItem());
        Mybox<Integer> intbox = new Mybox<>();
        intbox.setItem(123);
        System.out.println(intbox.getItem());
        Mybox<Double> doubox = new Mybox<>();
        doubox.setItem(0.486);
        System.out.println(doubox.getItem());



    }
}
