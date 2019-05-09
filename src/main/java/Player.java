import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> playerCards;

    public Player(String name, ArrayList<Card> playerCards) {
        this.name = name;
        this.playerCards = playerCards;
    }

    public Player(String name) {
        this.name = name;
        this.playerCards = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getNumbeOfPlayersCards() {
        return this.playerCards.size();
    }

    public void getCard(Card card) {
        this.playerCards.add(card);
    }

    public void playHand(Card card) {
        this.playerCards.remove(card);
    }

    public int getCardValue() {
        int total = 0;
        for (Card card : this.playerCards){
            total += card.getValue();
        }
        return total;


    }
}
