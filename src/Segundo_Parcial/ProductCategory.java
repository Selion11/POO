package Segundo_Parcial;

import java.util.Objects;

public enum ProductCategory{
    BOOKS(5,0),
    ELECTRONICS(80,1.1),
    GROCERY(5,1.25);

    private int points;
    private double multi;

    ProductCategory(int points,double multi){
        this.points = points;
        this.multi = multi;
    }

    double totalPoints(double price){
        return points + price*multi;
    }

}
