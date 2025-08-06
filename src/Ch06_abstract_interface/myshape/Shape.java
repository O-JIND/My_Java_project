package Ch06_abstract_interface.myshape;

public abstract class Shape {
    private String linecolor;
    private String fillcolor;

    public Shape(String linecolor, String fillcolor) {
        this.linecolor = linecolor;
        this.fillcolor = fillcolor;
    }


    abstract double area();
    abstract double around();


    protected final void draw(){
        System.out.println("라인 색상 : " + linecolor);
        System.out.println("채우기 색상 : " + fillcolor);


    }


}
