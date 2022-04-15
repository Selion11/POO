package Primer_Parcial;

public class ResidentialFunctionalUnit extends FunctionalUnit{

    private int rooms;
    public ResidentialFunctionalUnit(Building b,String name, int m2, int rooms){
        super(b,name,m2);
        this.rooms = rooms;
    }

    @Override
    double getTotal(){
        return super.getCosts() + super.getRoomCosts(rooms);
   }

    @Override
    public String toString(){
        return String.format("Residencial: U.F %s (%d m2) : $%.2f",name,m2,getTotal());
    }
}
