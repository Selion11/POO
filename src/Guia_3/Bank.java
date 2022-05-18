package Guia_3;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<account> accounts = new ArrayList<>();

    public int accountSize(){
        return accounts.size();
    }
    public void addAccount(account acc){
        accounts.add(acc);
    }
    public double totalAmount(){
        double value = 0;
        for(account acc : accounts){
            value += acc.getBalance();
        }
        return value;
    }

    public void removeAccount(account acc){
        accounts.remove(acc);
    }
}
