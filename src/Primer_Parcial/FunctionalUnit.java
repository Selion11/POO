package Primer_Parcial;

public abstract class FunctionalUnit{
    private Building building;
    protected String name;
    protected int m2;

    protected FunctionalUnit(Building building,String name,int m2){
        this.building = building;
        this.name = name;
        this.m2 = m2;
    }

    protected double getCosts(){
        return m2 * building.getM2Expense();
    }

    protected double getRoomCosts(int rooms){
        return rooms * building.getResidentialRoomExpense();
    }

    protected double getMultiplier(){
        return building.getCommercialMult();
    }

    abstract double getTotal();
}
