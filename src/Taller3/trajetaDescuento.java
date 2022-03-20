package Taller3;

public class trajetaDescuento extends rechargableCard{
    double descuento;

    trajetaDescuento(subwayCentral central,double descuento){
        super(central);
        this.descuento = descuento;
    }

    protected void viajar(){
        double cost = super.getCost();
        balance -= cost * descuento;
    }

    protected boolean canTravel(){
       double cost = super.getCost();
       cost -= cost * descuento;
       return balance > cost;
    }
}
