import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card1;
    Card card2;
    Card card3;

    @Before
    public void before(){
        deck = new Deck();
        deck.populateCards();
        card1 = new Card(Rank.ACE, Suit.HEART);
        card2 = new Card(Rank.QUEEN, Suit.HEART);
        card3 = new Card(Rank.EIGHT, Suit.SPADE);


    }

    @Test
    public void hasLength(){
        assertEquals(0, deck.getLength());
    }


    @Test
    public void canCreateAllCards(){

        assertEquals(52, deck.getLength() );
    }


    @Test
    public void canRemoveCard(){
        deck.removeCard();
        assertEquals(51, deck.getLength());

    }


}
