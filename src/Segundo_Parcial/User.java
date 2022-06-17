package Segundo_Parcial;

public class User {
    private String name;
    private double points = 0;
    public User(String name){
        this.name = name;
    }

    public void addPoints(double points){this.points += points;}

    public double getPoints(){return points;}

    @Override
    public String toString() {
        return String.format("Puntos del usuario %s: %.2f", name, points);
    }
}
