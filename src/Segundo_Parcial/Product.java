package Segundo_Parcial;

public class Product{
    private String name;
    private ProductCategory categ;
    private double price;

    public Product(String name,ProductCategory categ,double price){
        this.name = name;
        this.categ = categ;
        this.price = price;
    }

    public double getPoints(){
        return categ.totalPoints(price);
    }

    public String getName(){return name;}

}
