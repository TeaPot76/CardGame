import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    private Player player;
    private Card card1;
    private Card card2;


    @Before
    public void before(){
        ArrayList<Card> playerCard = new ArrayList<>();
        card1 = new Card(Rank.EIGHT, Suit.DIAMOND);
        card2 = new Card(Rank.FIVE, Suit.DIAMOND);
        playerCard.add(card1);
        playerCard.add(card2);
        player = new Player("Ben", playerCard);

    }

    @Test
    public void hasName(){
        assertEquals("Ben", player.getName());
    }

    @Test
    public void hasNumberOfPlayersCards(){
        assertEquals(2, player.getNumbeOfPlayersCards());
    }
    @Test
    public void canGetCard(){
        player.getCard(card2);

        assertEquals(3, player.getNumbeOfPlayersCards());
    }
    @Test
    public void canPlayHand(){

        player.playHand(card1);
        assertEquals(1, player.getNumbeOfPlayersCards());
    }
    @Test
    public void playersCardValue(){

        assertEquals(13, player.getCardValue());

    }
}
