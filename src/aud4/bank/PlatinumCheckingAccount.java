package aud4.bank;

public class PlatinumCheckingAccount extends InterestCheckingAccount{

    public PlatinumCheckingAccount(String accountOwner, int id, double currentAmount) {
        super(accountOwner, id, currentAmount);
    }
    @Override
    public void addInterest() {
        addAmount(getBalance() * INTEREST_RATE * 2 );
    }
}
