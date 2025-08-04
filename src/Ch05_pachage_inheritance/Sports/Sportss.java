package Ch05_pachage_inheritance.Sports;

public class Sportss {
    private String name;
    private int entry;

    public Sportss(String name, int entry) {
        this.name = name;
        this.entry = entry;
    }

    public void Sinfo(){
        System.out.printf("%s is play with %d people\n",name,entry);
    }

}
