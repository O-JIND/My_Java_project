package Practice_myself;

public class Outerclass {
    private String outerFiled = "Outer";

    class Innerclass {
        public void display() {
            System.out.println("Accessing " + outerFiled);
        }
    }

    public static void main(String[] args) {
        Outerclass outer = new Outerclass();
        Innerclass inner = outer.new Innerclass();
        inner.display();

    }
}
