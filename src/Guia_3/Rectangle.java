package Guia_3;

public class Rectangle extends figure{

    public Rectangle(Point point1,Point point2){
        super();
        points = new Point[2];
        points[0] = point1;
        points[1] = point2;
    }

    @Override
    void setBase(){
        this.base = points[0].distX(points[1]);
    }

    @Override
    void setHeight(){
        this.height = points[0].distY(points[1]);
    }

    @Override
    double area(){
        return height * base;
    }

    @Override
     double perimeter(){
        return (base * 2) + (height *2);
    }
}
