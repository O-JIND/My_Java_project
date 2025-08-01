package Practice_collection;

public class Genn<T> {
   private T item;
   public void setItem(T item){
       this.item=item;
   }
    public T getItem(){return item;}


    @Override
    public String toString(){
       return " sidjao " + item;
    }

}

