package Problem_Practice.EM;

public class Manager extends Employee implements Manageable{

    public Manager(String name) {
        super(name);
    }


    @Override
    public void work() {
        System.out.println(super.getName()+" is manage well");
    }

    @Override
    public void manage() {
        System.out.println(super.getName()+" is a Manager");

    }




}


