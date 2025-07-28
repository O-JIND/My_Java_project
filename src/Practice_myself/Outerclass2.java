package Practice_myself;

public class Outerclass2 {
    private static String staticOuterField = "StaticOuter";

    public static class StaticNestedclass {
        public void display(){
            System.out.println("Accsessing static outer filed"+staticOuterField);
        }
    }

    public static void main(String[] args) {
        StaticNestedclass nested = new StaticNestedclass();
        nested.display();

    }
}
