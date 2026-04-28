package oop.labor08;

public class SavingsAccount extends BankAccount{
    private  double interestRate;
    public SavingsAccount(double interestRate){
        this.interestRate=interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    void addInterest(){
        deposit(interestRate*getBalance());
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
