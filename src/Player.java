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

    /*
    imprimir as três cartas do jogador lado a lado com índice
    (0) Ás de Copas (1) Dois de Paus (2) Quatro de Ouros
     */
    @Override
    public String toString() {
        String player = "";
        for (int i = 0; i < hand.length; i++) {
            player += "(" + i + ") " + hand[i] + " ";
        }
        return player;
    }
}
