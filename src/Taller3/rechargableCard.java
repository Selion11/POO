package Taller3;

public class rechargableCard extends subwayCard{
    double balance;

    public rechargableCard(subwayCentral central){
        super(central);
    }

    @Override
    protected void viajar() {

        balance -= super.getCost();
    }

    @Override
    protected boolean canTravel() {
        return balance > super.getCost();
    }

    protected void recharge(double charge){
        balance += charge;
    }

    protected double getBalance(){
        return balance;
    }
}
