package Guia_3;

public class Triangle extends figure{

    Triangle(Point point1,Point point2,Point point3){
        super();
        points = new Point[3];
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;

    }

    @Override
    void setBase(){
        if(points[0].getX() != points[1].getX()){
            base = points[0].distX(points[1]);
        }else{
            base = points[0].distX(points[2]);
        }
    }

    @Override
    void setHeight(){
        if(points[0].getY() != points[1].getY()){
            height = points[0].distY(points[1]);
        }else{
            height = points[0].distY(points[2]);
        }
    }

    @Override
    public double area(){
        return height * base *0.5;
    }

    @Override
    public double perimeter(){
        return points[0].distanceTo(points[1]) + points[0].distanceTo(points[2]) + points[1].distanceTo(points[2]);
    }
}
