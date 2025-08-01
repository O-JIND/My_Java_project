package Practice_collection;

public class GenericC<T> {
    private  T value;
    public void set(T value){this.value=value;}
    public T get(){return value;}


    public static void main(String[] args) {
        GenericC<String> strGenericC = new GenericC<>();
        strGenericC.set("Nihao");


    }



}
