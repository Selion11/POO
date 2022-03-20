package Guia_3;

public class CheckingAccount extends account{

    private double allowed;

    CheckingAccount(int iden,double allowed){
        super(iden);
        this.allowed = allowed;
    }

    void extract(double money){
        if((super.getBalance() + allowed) >= money){
            super.extratction(money);
        }else
            System.out.println("Insufficent money on Cheking account");
    }
}
