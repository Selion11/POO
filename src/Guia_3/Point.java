package Guia_3;
import java.lang.Math;

public class Point {
    private int  x;
    private int  y;

    Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other){
        double xDist = this.x - other.x;
        double yDist = this.y - other.y;

        return Math.sqrt(Math.pow(xDist,2) - Math.pow(yDist,2));
    }

    public int distX(Point other){
        if(this.x > other.x){
            return this.x-other.x;
        }else
            return other.x-this.x;
    }

    public int distY(Point other){
        if(this.y > other.y){
            return this.y-other.y;
        }else
            return other.y-this.y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

}
