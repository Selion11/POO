package Guia4;

public class MovableTester {
    public void Main(String[] Args){
        MovablePoint p = new MovablePoint(2,3);
        System.out.println(p);
        p.moveNorth(3);
        System.out.println(p);
    }
}
