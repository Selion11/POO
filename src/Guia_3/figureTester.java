package Guia_3;

abstract class figure{
    protected Point[] points;
    protected double base;
    protected double height;

    protected void fig(){
    }
    abstract void setBase();
    abstract void setHeight();
    abstract double area();
    abstract double perimeter();



}

public class figureTester {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(new Point(0, 0), new Point(2, 4));
        System.out.println(myRectangle);
        System.out.println(String.format("%.2f", myRectangle.perimeter()));
        System.out.println(String.format("%.2f", myRectangle.area()));
       // System.out.println(String.format("%.2f", myRectangle.base));
       // System.out.println(String.format("%.2f", myRectangle.height));

        Triangle myTriangle = new Triangle(new Point(0, 0), new Point(1, 0), new Point(0, 1));
        System.out.println(myTriangle);
        System.out.println(String.format("%.2f", myTriangle.perimeter()));
        System.out.println(String.format("%.2f", myTriangle.area()));

        Ellipse myEllipse = new Ellipse(new Point(0, 0), 2, 1);
        System.out.println(myEllipse);
        System.out.println(String.format("%.2f", myEllipse.perimeter()));
        System.out.println(String.format("%.2f", myEllipse.area()));

        Circle myCircle = new Circle(new Point(0, 0), 3);
        System.out.println(myCircle);
        System.out.println(String.format("%.2f", myCircle.perimeter()));
        System.out.println(String.format("%.2f", myCircle.area()));
    }
}

