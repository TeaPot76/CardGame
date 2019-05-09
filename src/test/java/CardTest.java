import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card(Rank.EIGHT, Suit.DIAMOND );
    }

    @Test
    public void hasSuit(){
        assertEquals(Suit.DIAMOND, card.getSuit());
    }
    @Test
    public void hasRank(){
        assertEquals(Rank.EIGHT, card.getRank());
    }

    @Test
    public void hasValue(){
        assertEquals(8, card.getValue());
    }
}
