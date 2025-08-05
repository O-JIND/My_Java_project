package Problem_Practice.EM;

public class Developer extends  Employee implements  codable {
    public Developer(String name) {
        super(name);
    }

        @Override
        public void work () {
            System.out.println(super.getName()+" is good at coding");
        }

        @Override
        public void code () {
            System.out.println(super.getName()+" is a Developer");

        }
    }
