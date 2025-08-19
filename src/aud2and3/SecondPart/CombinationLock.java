package aud2and3.SecondPart;

public class CombinationLock {

    private int combination;
    private boolean isOpen;
    public static int DEFAULT_COMBINATION = 100;

    public CombinationLock(int combination) {
        if (isCombinationValid(combination)) {
            this.combination = combination;
        } else
            this.combination = DEFAULT_COMBINATION;
        this.isOpen = false;
    }

    private boolean isCombinationValid(int combination) {
        return combination >= 100 && combination <= 999;
    }

    public boolean open(int combination) {
        this.isOpen = (this.combination == combination);
        return this.isOpen;
    }

    public boolean changeCombination(int Oldcombination, int newCombination) {
        if (open(Oldcombination) && isCombinationValid(newCombination)) {
            this.combination = newCombination;
            return true;
        }
        return false;
    }
    public void lock(){
        this.isOpen = false;
    }

    public static void main(String[] args) {
        CombinationLock validLock = new CombinationLock(234);
        System.out.println(validLock.open(233));
        System.out.println(validLock.open(234));
        System.out.println(validLock.open(235));

        CombinationLock invalidLock = new CombinationLock(234567);
    }
}
