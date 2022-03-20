package Taller3;

abstract class subwayCard{
    subwayCentral central;
    public subwayCard(subwayCentral central){
        this.central = central;
    }
    protected abstract void viajar();

    protected abstract boolean canTravel();

    protected double getCost(){
        return central.getCost();
    }

}
