package Guia4;

import Guia_3.Triangle;

public class MovableTriangle extends Triangle implements Movable{

    public MovableTriangle(MovablePoint first,MovablePoint second,MovablePoint third) {
        super(first,second,third);
    }

    @Override
    public void moveNorth(double delta) {
        ((MovablePoint)firstPoint).moveNorth(delta);
        ((MovablePoint)secondPoint).moveNorth(delta);
        ((MovablePoint)thirdPoint).moveNorth(delta);
    }

    @Override
    public void moveSouth(double delta){
        ((MovablePoint)firstPoint).moveSouth(delta);
        ((MovablePoint)secondPoint).moveSouth(delta);
        ((MovablePoint)thirdPoint).moveSouth(delta);
    }

    @Override
    public void moveWest(double delta){
        ((MovablePoint)firstPoint).moveWest(delta);
        ((MovablePoint)secondPoint).moveWest(delta);
        ((MovablePoint)thirdPoint).moveWest(delta);
    }

    @Override
    public void moveEast(double delta){
        ((MovablePoint)firstPoint).moveEast(delta);
        ((MovablePoint)secondPoint).moveEast(delta);
        ((MovablePoint)thirdPoint).moveEast(delta);
    }
}
