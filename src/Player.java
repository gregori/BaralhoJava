/*
O jogador possui um método playCard que retira uma carta da mão e joga
public Card playCard(int index)  <- distribuir
 */

public class Player {
    private Card[] hand; // mão do jogador (suas cartas)
    private final int HAND_SIZE = 3;
    private int currentCard;

    public Player() {
        hand = new Card[HAND_SIZE];
        currentCard = 0;
    }

    public void receiveCard(Card card) {
        if (currentCard < HAND_SIZE) { // se a mão ainda não está cheia
            hand[currentCard++] = card;
        }
    }

    public Card playCard(int index) {
        Card temp = hand[index]; // recupero a carta escolhida
        hand[index] = null; // remove a carta da mão
        return temp; // retorna a carta escolhida
    }
}
