package Ch06_abstract_interface.myshape.cartest;

public enum Key {
    KEY("열쇠키"), SMART("스마트키") ;

    private String name ;

    Key(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}