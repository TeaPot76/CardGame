import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private Deck deck;
    private Dealer dealer;
    private Player player1;
    private Player player2;
    private ArrayList<Player> players;
    private Card card;


    @Before
    public void before() {

        dealer = new Dealer();
        player1 = new Player("Ben");
        player2 = new Player("Ali");
        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        deck = new Deck();
        game = new Game("DrewACard", players, deck, dealer);
        card = new Card(Rank.ACE, Suit.CLUB);
    }

    @Test
    public void hasName() {
        assertEquals("DrewACard", game.getName());
    }

    @Test
    public void hasPlayers() {
        assertEquals(players, game.getPlayers());
    }

    @Test
    public void hasNumberOfPlayers() {
        assertEquals(2, game.getNumberOfPlayers());
    }

    //
    @Test
    public void hasDeck() {
        assertEquals(deck, game.getDeck());
    }

    @Test
    public void hasDealer() {
        assertEquals(dealer, game.getDealer());
    }

    @Test
    public void canPlayGame() {
        deck.populateCards();
        game.playGame();
        assertEquals(1, player1.getNumbeOfPlayersCards());
        assertEquals(1, player2.getNumbeOfPlayersCards());
        assertEquals(50, deck.getLength());
    }

    @Test
    public void canWin(){

     player1.getCard(new Card(Rank.EIGHT, Suit.DIAMOND));
     player2.getCard(new Card(Rank.FIVE, Suit.CLUB));
     assertEquals(player1, game.checkWinner());
  }

}