package Guia_3;

public class Ellipse extends figure{

    public Ellipse(Point point,int a,int b) {
        super();
    }

    @Override
    void setBase(){
    }

    @Override
    void setHeight(){
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
