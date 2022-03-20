package Guia_3;

public class SavingsAccount extends account{

    SavingsAccount(int iden){
        super(iden);
    }

    void extract(double money){
        if(super.getBalance()>= money){
            super.extratction(money);
        }else
            System.out.println("Insufficent money on savings account");
    }
}
