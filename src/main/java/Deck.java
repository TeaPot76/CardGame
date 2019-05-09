import java.nio.channels.Pipe;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }


    public int getLength() {
        return cards.size();
    }

    public void populateCards() {
        for (Rank rank : Rank.values()){
            for(Suit suit: Suit.values()){
                this.cards.add(new Card(rank, suit));
//                System.out.println(this.cards);


            }
        }

    }

     public void shuffle(){
        this.populateCards();
        Collections.shuffle(this.cards);
     }

    public Card removeCard() {
        this.shuffle();
        return this.cards.remove(0);
    }
}
