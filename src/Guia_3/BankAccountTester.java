package Guia_3;
abstract class account{
    private int identification;
    private double balance;

    protected account(int identification){
        this.identification = identification;
        this.balance = 0;
    }

    protected double getBalance(){
        return balance;
    }

    protected void extratction(double extraction){
        balance -= extraction;
    }

    protected void deposit(double money){
        balance += money;
    }

    @Override
    public String toString(){
        return String.format("Cuenta %d con saldo %.2f",identification,balance);
    }

}


public class BankAccountTester{
        public static void main(String[] args) {
            /*CheckingAccount myCheckingAccount = new CheckingAccount(1001, 50);
            myCheckingAccount.deposit(100.0);
            System.out.println(myCheckingAccount);
            myCheckingAccount.extract(150.0);
            System.out.println(myCheckingAccount);

            SavingsAccount mySavingsAccount = new SavingsAccount(1002);
            mySavingsAccount.deposit(100.0);
            System.out.println(mySavingsAccount);
            mySavingsAccount.extract(150.0); // No se realiza por falta de fondos
            System.out.println(mySavingsAccount);
          */
            Bank bank = new Bank();
            account c1 = new CheckingAccount(1234, 5000);
            account c2 = new CheckingAccount(3462, 5000);
            bank.addAccount(c1);
            bank.addAccount(c2);
            System.out.println(bank.accountSize());
            System.out.println(bank.totalAmount());
            c1.deposit(100);
            c2.deposit(200);
            bank.removeAccount(c2);
            System.out.println(bank.accountSize());
            System.out.println(bank.totalAmount());
        }
}
