package aud2and3.SecondPart.cards;

public class MultipleDecks {

    private Deck[] decks;

    public MultipleDecks(int numberOfDecks) {
        decks = new Deck[numberOfDecks];
        for (int i = 0; i < numberOfDecks; i++) {
            decks[i] = new Deck();
        }

    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Deck d : decks) {
            str.append(d.toString());
            str.append("\n");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        MultipleDecks multipleDecks = new MultipleDecks(3);
        System.out.println(multipleDecks);
    }
}
