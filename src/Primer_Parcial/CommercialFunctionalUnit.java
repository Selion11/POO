package Primer_Parcial;

public class CommercialFunctionalUnit extends FunctionalUnit{

    public CommercialFunctionalUnit(Building building,String name,int m2){
        super(building,name,m2);
    }

    @Override
    double getTotal(){
        return super.getCosts() * super.getMultiplier();
    }

    @Override
    public String toString(){
        return String.format("Comercial: U.F %s (%d m2) : $%.2f",name,m2,getTotal());
    }

}
