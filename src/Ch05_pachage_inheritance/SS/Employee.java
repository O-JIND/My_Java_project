package Ch05_pachage_inheritance.SS;

public class Employee  {
    protected String name, type;
    public String ceoname = "강감찬";
    static int i=0;

    public Employee(String name,String type){
        this.name = name;
        this.type = type;
        i++;
    }

}
