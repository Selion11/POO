package Guia4;

import Guia_3.Point;

public class MovablePoint extends Point implements Movable{
    public MovablePoint(double x, double y){
        super(x,y);
    }
    public void moveNorth(double delta){
        y+= delta;
    }
    public void moveSouth(double delta){
        y-= delta;
    }
    public void moveWest(double delta){
        x+= delta;
    }
    public void moveEast(double delta){
        x-=delta;
    }
}
