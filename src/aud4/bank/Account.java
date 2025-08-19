package aud4.bank;

public class Account {

    private String accountOwner;
    private int id;
    private static int idSeed = 10000;
    private double currentAmount;

    public Account(String accountOwner, double currentAmount) {
        this.accountOwner = accountOwner;
        this.id = idSeed;
        this.currentAmount = currentAmount;
        idSeed++;
    }
    public Account(String accountOwner,int id,double currentAmount) {
        this.accountOwner = accountOwner;
        this.id = id;
        this.currentAmount = currentAmount;
    }

    public double getBalance() {
        return currentAmount;
    }
    public void addAmount(double amount) {
        currentAmount += amount;
    }
    public void withdraw(double amount) throws CanNotWithdrawMoneyException {
        if (amount > currentAmount) {
            currentAmount -= amount;
        }
        else throw new CanNotWithdrawMoneyException(currentAmount,amount);
    }

    @Override
    public String toString() {
        return String.format("%d: %.2f", id, currentAmount);
    }
}
