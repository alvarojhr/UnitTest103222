import models.Card;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CardTest {
    @Test
    void testgetRank() {
        Card card = new Card(Card.Suit.CLUBS, Card.Rank.KING);
        assertEquals(Card.Rank.KING,card.getRank());

    }
    @Test
    void TestToString (){
        Card card = new Card(Card.Suit.CLUBS, Card.Rank.KING);
        assertEquals(Card.Rank.KING+" "+ Card.Suit.CLUBS,card.toString());
    }
}

