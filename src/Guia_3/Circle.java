package Guia_3;

public class Circle extends figure{
    private int radius;
    Point center;
    private final double PI = 3.14159;

    public Circle(Point point,int radius){
        super();
        this.radius = radius;
        points = new Point[1];
        points[0] = point;
    }

    @Override
    void setBase(){
    }

    @Override
    void setHeight(){
    }

    @Override
    public double area(){
        return PI * Math.pow(radius,2);
    }

    @Override
    public double perimeter(){
        return 2*radius*PI;
    }
}
