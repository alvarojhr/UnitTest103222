import models.Card;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class CardTest {
    @Test
    void testToString (){
        Card card = new Card(Card.Suit.CLUBS, Card.Rank.QUEEN);
        assertEquals(Card.Rank.QUEEN, card.getRank());
    }
}
