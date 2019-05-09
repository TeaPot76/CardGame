import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DealerTest {

    private Deck deck;
    private Dealer dealer;


    @Before
    public void before() {
        deck = new Deck();
        dealer = new Dealer();
    }

        @Test
        public void dealerCanDeal(){
            deck.populateCards();
            Card card = dealer.deal(deck);
            assertEquals(51, deck.getLength());
        }
}

