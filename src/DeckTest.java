public class DeckTest {
    public static void main(String[] args) {
        FullDeck deck = new FullDeck();
        deck.shuffle();

        Card dealtCard;
        do {
            dealtCard = deck.dealCard();
            if (dealtCard != null)
                System.out.println(dealtCard);
        } while (dealtCard != null);
    }
}
