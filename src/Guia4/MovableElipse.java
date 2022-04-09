package Guia4;

import Guia_3.Ellipse;

public class MovableElipse extends Ellipse implements Movable{
    public MovableElipse(MovablePoint centre,double mayor, double menor){
        super(centre,mayor,menor);
    }

    @Override
    public void moveNorth(double delta){
        ((MovablePoint)centerPoint).moveNorth(delta);
    }
    
    @Override
    public void moveSouth(double delta){
        ((MovablePoint)centerPoint).moveSouth(delta);
    }
    
    @Override
    public void moveWest(double delta){
        ((MovablePoint)centerPoint).moveWest(delta);
    }
    
    @Override
    public void moveEast(double delta){
        ((MovablePoint)centerPoint).moveEast(delta);
    }
}
