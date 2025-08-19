package aud4.bank;

public class InterestCheckingAccount extends Account implements InterestBearingAccount{
    public static final double INTEREST_RATE = 0.03;

    public InterestCheckingAccount(String accountOwner, int id, double currentAmount) {
        super(accountOwner, id, currentAmount);
    }

    @Override
    public void addInterest() {
        addAmount(getBalance() * INTEREST_RATE );
    }

}
