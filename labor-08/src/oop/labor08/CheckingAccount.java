package oop.labor08;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;
    CheckingAccount(double overdraftLimit){
        this.overdraftLimit=overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    public boolean withdraw(double sum){
        if(sum<=overdraftLimit){
            withdraw(sum);
            return true;
        }
        System.out.println("Tul nagy osszeg");
        return false;
    }
}
